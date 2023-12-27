package com.proyecto.proyecto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.proyecto.entity.Usuarios;
@Service
public interface UsuariosService {
     public List<Usuarios> listar();
	
	public Usuarios verUno(Long id);

    public Usuarios registrar(Usuarios usuarios);

    public Usuarios actualizar(Usuarios usuarios, Long id);

    public void eliminar(Long id);
}
