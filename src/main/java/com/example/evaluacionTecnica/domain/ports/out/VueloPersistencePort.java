package com.example.evaluacionTecnica.domain.ports.out;

import com.example.evaluacionTecnica.domain.models.Vuelo;

import java.util.Optional;

public interface VueloPersistencePort {
    public Optional<Vuelo> findById(String id);
}
