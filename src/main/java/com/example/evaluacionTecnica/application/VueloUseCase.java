package com.example.evaluacionTecnica.application;

import com.example.evaluacionTecnica.domain.exception.NotFoundException;
import com.example.evaluacionTecnica.domain.models.ResponseData;
import com.example.evaluacionTecnica.domain.models.Vuelo;
import com.example.evaluacionTecnica.domain.ports.in.VueloServicePort;
import com.example.evaluacionTecnica.domain.ports.out.VueloPersistencePort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class VueloUseCase implements VueloServicePort {

    private final VueloPersistencePort vueloPersistencePort;

    public VueloUseCase(VueloPersistencePort vueloPersistencePort) {
        this.vueloPersistencePort = vueloPersistencePort;
    }

    @Override
    public ResponseData findById(String id){
     Optional<Vuelo> vueloOptional = vueloPersistencePort.findById(id);
     if(!vueloOptional.isPresent()){
         throw new NotFoundException("Vuelo no encontrado");
     }
     return ResponseData.builder().data(vueloOptional.get()).status(HttpStatus.OK).build();
    }
}
