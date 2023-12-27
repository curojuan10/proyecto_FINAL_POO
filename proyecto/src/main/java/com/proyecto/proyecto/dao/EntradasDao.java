package com.proyecto.proyecto.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.proyecto.entity.Entradas;

public interface EntradasDao extends CrudRepository <Entradas, Long> {
    
}
