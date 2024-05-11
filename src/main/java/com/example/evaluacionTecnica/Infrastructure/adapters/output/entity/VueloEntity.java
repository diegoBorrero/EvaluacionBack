package com.example.evaluacionTecnica.Infrastructure.adapters.output.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "VUELO")
public class VueloEntity {
    @Id
    @Column(name = "ID_VUELO")
    private String idVuelo;
    @Column(name = "NOMBRE")
    private String nombre;
}
