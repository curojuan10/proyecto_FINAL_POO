package com.proyecto.proyecto.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.proyecto.entity.Articulos;

public interface ArticulosDao extends CrudRepository <Articulos, Long>{
    
}
