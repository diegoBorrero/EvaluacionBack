package com.example.evaluacionTecnica.domain.ports.in;

import com.example.evaluacionTecnica.domain.models.ResponseData;

public interface VueloServicePort {
    public ResponseData findById(String id);
}
