package com.example.evaluacionTecnica.domain.ports.out;

import com.example.evaluacionTecnica.domain.models.Reserva;

import java.time.LocalDateTime;

public interface ReservaPersistencePort {
    public Reserva actualizarFecha(String idReserva, LocalDateTime dateTime);
    public void cancelarReserva(String idReserva, String idUsuario);
}
