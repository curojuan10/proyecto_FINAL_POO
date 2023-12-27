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

import com.proyecto.proyecto.entity.Articulos;
import com.proyecto.proyecto.service.ArticulosService;

@RestController
public class ArticulosController {
    @Autowired
    ArticulosService articulosService;
    
     @GetMapping("/lista")
	public List<Articulos> verTodo() {
		return articulosService.listar();
	}

	@GetMapping("/lista/{id}")
	public Articulos verUno(@PathVariable Long id) {
		return articulosService.verUno(id);
	}

	@PostMapping("/registrar")
	public Articulos registar(@RequestBody Articulos articulos){
		return articulosService.registrar(articulos);
	}

	@PutMapping("/actualizar/{id}")
	public Articulos actualizar(@RequestBody Articulos articulos, @PathVariable Long id){
		return articulosService.actualizar(articulos,id);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		articulosService.eliminar(id);
	}
    
    
}
