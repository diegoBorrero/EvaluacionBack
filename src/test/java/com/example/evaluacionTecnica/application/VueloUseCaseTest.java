package com.example.evaluacionTecnica.application;

import com.example.evaluacionTecnica.domain.models.ResponseData;
import com.example.evaluacionTecnica.domain.models.Vuelo;
import com.example.evaluacionTecnica.domain.ports.out.VueloPersistencePort;
import org.aspectj.apache.bcel.classfile.Module;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class VueloUseCaseTest {

    @Mock
    VueloPersistencePort vueloPersistencePort;

    @InjectMocks
    VueloUseCase vueloUseCase;

    private Vuelo vuelo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        vuelo =  new Vuelo();
        vuelo.setIdVuelo("UUID");
        vuelo.setNombre("NOMBRE");
    }

    @DisplayName("Dado que un usuario consulte un vuelo por id que exista debe retornar un status Ok")
    @Test
    void findById() {
        Optional<Vuelo> vueloOptional = Optional.ofNullable(vuelo);
        when(vueloPersistencePort.findById(anyString())).thenReturn(vueloOptional);
        ResponseData responseData = vueloUseCase.findById("UUID");
        assertEquals(responseData.getStatus(), HttpStatus.OK);
    }
}