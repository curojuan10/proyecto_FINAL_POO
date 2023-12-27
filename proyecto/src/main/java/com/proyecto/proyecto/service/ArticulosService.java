package com.proyecto.proyecto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.proyecto.entity.Articulos;

@Service
public interface ArticulosService {
    public List<Articulos> listar();
	
	public Articulos verUno(Long id);

    public Articulos registrar(Articulos articulos);

    public Articulos actualizar(Articulos articulos, Long id);

    public void eliminar(Long id);
    
}
