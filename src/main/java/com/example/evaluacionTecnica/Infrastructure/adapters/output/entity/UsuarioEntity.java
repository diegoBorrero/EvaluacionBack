package com.example.evaluacionTecnica.Infrastructure.adapters.output.entity;

import com.example.evaluacionTecnica.domain.models.Reserva;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "USUARIO")
public class UsuarioEntity {
    @Id
    @Column(name = "ID_USUARIO")
    private String idUsuario;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarioEntity")
    private List<ReservaEntity> reservaEntityList = new ArrayList<>();
}
