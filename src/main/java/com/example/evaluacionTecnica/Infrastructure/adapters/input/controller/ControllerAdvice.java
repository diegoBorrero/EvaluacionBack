package com.example.evaluacionTecnica.Infrastructure.adapters.input.controller;

import com.example.evaluacionTecnica.domain.exception.NotFoundException;
import com.example.evaluacionTecnica.domain.models.ResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ResponseData> notFoundException(NotFoundException ex){
        return new ResponseEntity<>(ResponseData.builder().status(HttpStatus.NOT_FOUND)
                .message(ex.getMessage()).build(),HttpStatus.NOT_FOUND);
    }
}
