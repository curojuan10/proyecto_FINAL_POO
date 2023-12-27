package com.proyecto.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto.entity.Salidas_detalle;
import com.proyecto.proyecto.service.Salidas_detalleService;



@RestController
public class Salidas_detalleController {
    @Autowired
    Salidas_detalleService sDetalleService;

     @GetMapping("/3lista")
	public List<Salidas_detalle> verTodo() {
		return sDetalleService.listar();
	}

	@GetMapping("/3lista/{id}")
	public Salidas_detalle verUno(@PathVariable Long id) {
		return sDetalleService.verUno(id);
	}

	@PostMapping("/3registrar")
	public Salidas_detalle registar(@RequestBody Salidas_detalle salidas_detalle){
		return sDetalleService.registrar(salidas_detalle);
	}

	@PutMapping("/3actualizar/{id}")
	public Salidas_detalle actualizar(@RequestBody Salidas_detalle salidas_detalle, @PathVariable Long id){
		return sDetalleService.actualizar(salidas_detalle,id);
	}

	@DeleteMapping("/3eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		sDetalleService.eliminar(id);
	}
    
}
