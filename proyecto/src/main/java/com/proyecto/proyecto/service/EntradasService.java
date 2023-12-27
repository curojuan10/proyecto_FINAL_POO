package com.proyecto.proyecto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.proyecto.entity.Entradas;
@Service
public interface EntradasService {
    public List<Entradas> listar();
	
	public Entradas verUno(Long id);

    public Entradas registrar(Entradas entradas);

    public Entradas actualizar(Entradas entradas, Long id);

    public void eliminar(Long id);
    
}
