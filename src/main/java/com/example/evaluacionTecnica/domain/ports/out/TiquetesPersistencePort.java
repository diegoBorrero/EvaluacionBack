package com.example.evaluacionTecnica.domain.ports.out;

import com.example.evaluacionTecnica.domain.models.Tiquete;

public interface TiquetesPersistencePort {
    public Tiquete reservarTiquete(String idReserva, String idTiquete);
}
