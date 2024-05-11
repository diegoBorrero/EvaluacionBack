package com.example.evaluacionTecnica.domain.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tiquete {
    private String idTiquete;
    private String idReserva;
}
