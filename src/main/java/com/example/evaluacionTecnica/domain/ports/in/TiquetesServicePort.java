package com.example.evaluacionTecnica.domain.ports.in;

import com.example.evaluacionTecnica.domain.models.Tiquete;

public interface TiquetesServicePort {
    public Tiquete reservarTiquete(String idReserva,String idTiquete);
}
