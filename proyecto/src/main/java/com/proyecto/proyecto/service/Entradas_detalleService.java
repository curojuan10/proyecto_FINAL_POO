package com.proyecto.proyecto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.proyecto.entity.Entradas_detalle;
@Service
public interface Entradas_detalleService {
    public List<Entradas_detalle> listar();
	
	public Entradas_detalle verUno(Long id);

    public Entradas_detalle registrar(Entradas_detalle detalle);

    public Entradas_detalle actualizar(Entradas_detalle detalle, Long id);

    public void eliminar(Long id);
    
}
