package com.example.evaluacionTecnica.Infrastructure.adapters.output.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "RESERVA")
public class ReservaEntity {
    @Id
    @Column(name = "ID_RESERVA")
    private String idReserva;
    @Column(name = "FECHA")
    private LocalDateTime fecha;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO")
    private UsuarioEntity usuarioEntity;
    @Column(name = "ESTADO")
    private Character estado;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "reservaEntity")
    private List<TiqueteEntity> tiqueteEntityList = new ArrayList<>();
}
