package com.example.evaluacionTecnica.Infrastructure.adapters.input.controller;

import com.example.evaluacionTecnica.domain.models.ResponseData;
import com.example.evaluacionTecnica.domain.ports.in.VueloServicePort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("airline/vuelo")
public class VueloController {

    private final VueloServicePort vueloServicePort;

    public VueloController(VueloServicePort vueloServicePort) {
        this.vueloServicePort = vueloServicePort;
    }

    @GetMapping(value = "findbyid")
    public ResponseEntity<ResponseData> findById(@RequestParam(required = true) String id){
        return new ResponseEntity<>(vueloServicePort.findById(id), HttpStatus.OK);
    }
}
