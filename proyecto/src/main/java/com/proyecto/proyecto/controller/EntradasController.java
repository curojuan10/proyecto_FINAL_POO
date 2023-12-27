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

import com.proyecto.proyecto.entity.Entradas;
import com.proyecto.proyecto.service.EntradasService;

@RestController
public class EntradasController {
    @Autowired
    EntradasService entradasService;

     @GetMapping("/2lista")
	public List<Entradas> verTodo() {
		return entradasService.listar();
	}

	@GetMapping("/2lista/{id}")
	public Entradas verUno(@PathVariable Long id) {
		return entradasService.verUno(id);
	}

	@PostMapping("/2registrar")
	public Entradas registar(@RequestBody Entradas entradas){
		return entradasService.registrar(entradas);
	}

	@PutMapping("/2actualizar/{id}")
	public Entradas actualizar(@RequestBody Entradas entradas, @PathVariable Long id){
		return entradasService.actualizar(entradas,id);
	}

	@DeleteMapping("/2eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		entradasService.eliminar(id);
	}
    
}
