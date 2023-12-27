package com.proyecto.proyecto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.proyecto.entity.Salidas_detalle;
@Service
public interface Salidas_detalleService {
    
    public List<Salidas_detalle> listar();
	
	public Salidas_detalle verUno(Long id);

    public Salidas_detalle registrar(Salidas_detalle salidas_detalle);

    public Salidas_detalle actualizar(Salidas_detalle salidas_detalle, Long id);

    public void eliminar(Long id);
    
    
}
