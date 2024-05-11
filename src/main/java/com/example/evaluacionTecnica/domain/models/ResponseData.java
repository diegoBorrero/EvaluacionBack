package com.example.evaluacionTecnica.domain.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ResponseData {
    private Object data;
    private HttpStatus status;
    private String message;
}
