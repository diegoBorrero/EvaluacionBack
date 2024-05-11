package com.example.evaluacionTecnica.Infrastructure.adapters.output.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TIQUETES")
public class TiqueteEntity {
    @Id
    @Column(name = "ID_TIQUETE")
    private String idTiquete;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RESERVA")
    private ReservaEntity reservaEntity;
}
