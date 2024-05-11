package com.example.evaluacionTecnica.Infrastructure.adapters.output.respositories;

import com.example.evaluacionTecnica.Infrastructure.adapters.output.entity.VueloEntity;
import com.example.evaluacionTecnica.Infrastructure.mappers.ObjectMapper;
import com.example.evaluacionTecnica.domain.models.Vuelo;
import com.example.evaluacionTecnica.domain.ports.out.VueloPersistencePort;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class VueloRepositoryAdapter implements VueloPersistencePort {
    private final VueloRepository vueloRepository;

    public VueloRepositoryAdapter(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public Optional<Vuelo> findById(String id){
        Optional<VueloEntity> vueloEntity = vueloRepository.findById(id);
        return Optional.ofNullable(vueloEntity.isPresent()?
                ObjectMapper.map(vueloEntity.get(),Vuelo.class): null);
    }
}
