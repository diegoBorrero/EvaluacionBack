package com.example.evaluacionTecnica.domain.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {
    private String idUsuario;
    private String nombre;
}
