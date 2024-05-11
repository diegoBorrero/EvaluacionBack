package com.example.evaluacionTecnica.Infrastructure.mappers;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ObjectMapper {
    private static final ModelMapper modelMapper;

    static {
        modelMapper= new ModelMapper();
    }

    public static <T,D>D map(T entity, Class<D> clazz){
        return modelMapper.map(entity,clazz);
    }

    public static <T,D> List<D> mapList(List<T> entityList,Class<D> clazz){
       return entityList.stream().map(entity->map(entity,clazz)).collect(Collectors.toList());
    }
}
