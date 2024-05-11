package com.example.evaluacionTecnica.domain.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Reserva {
    private String idReserva;
    private LocalDateTime fecha;
    private String idUsuario;
    private Character estado;
}
