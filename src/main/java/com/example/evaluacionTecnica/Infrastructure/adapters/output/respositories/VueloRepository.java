package com.example.evaluacionTecnica.Infrastructure.adapters.output.respositories;

import com.example.evaluacionTecnica.Infrastructure.adapters.output.entity.VueloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<VueloEntity,String> {
}
