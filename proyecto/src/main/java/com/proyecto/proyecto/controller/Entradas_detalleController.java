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

import com.proyecto.proyecto.entity.Entradas_detalle;
import com.proyecto.proyecto.service.Entradas_detalleService;
@RestController
public class Entradas_detalleController {
    @Autowired
    Entradas_detalleService entradas;

     @GetMapping("/1lista")
	public List<Entradas_detalle> verTodo() {
		return entradas.listar();
	}

	@GetMapping("/1lista/{id}")
	public Entradas_detalle verUno(@PathVariable Long id) {
		return entradas.verUno(id);
	}

	@PostMapping("/1registrar")
	public Entradas_detalle registar(@RequestBody Entradas_detalle detalle){
		return entradas.registrar(detalle);
	}

	@PutMapping("/1actualizar/{id}")
	public Entradas_detalle actualizar(@RequestBody Entradas_detalle detalle, @PathVariable Long id){
		return entradas.actualizar(detalle,id);
	}

	@DeleteMapping("/1eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		entradas.eliminar(id);
	}


}
