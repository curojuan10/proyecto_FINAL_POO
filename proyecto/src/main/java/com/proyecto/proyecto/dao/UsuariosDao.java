package com.proyecto.proyecto.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.proyecto.entity.Usuarios;

public interface UsuariosDao extends CrudRepository <Usuarios, Long>{
    
}
