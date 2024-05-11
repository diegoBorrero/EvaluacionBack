package com.example.evaluacionTecnica.domain.ports.in;

import com.example.evaluacionTecnica.domain.models.Reserva;

import java.time.LocalDateTime;

public interface ReservaServicePort {
    public Reserva actualizarFecha(String idReserva, LocalDateTime dateTime);
    public void cancelarReserva(String idReserva, String idUsuario);
}
