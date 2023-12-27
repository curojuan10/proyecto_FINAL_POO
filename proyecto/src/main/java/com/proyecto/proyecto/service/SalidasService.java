package com.proyecto.proyecto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.proyecto.entity.Salidas;
@Service
public interface SalidasService {
     public List<Salidas> listar();
	
	public Salidas verUno(Long id);

    public Salidas registrar(Salidas salidas);

    public Salidas actualizar(Salidas salidas, Long id);

    public void eliminar(Long id);
}
