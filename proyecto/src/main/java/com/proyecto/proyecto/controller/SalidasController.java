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

import com.proyecto.proyecto.entity.Salidas;
import com.proyecto.proyecto.service.SalidasService;

@RestController
public class SalidasController {
    @Autowired
    SalidasService salidasService;

     @GetMapping("/4lista")
	public List<Salidas> verTodo() {
		return salidasService.listar();
	}

	@GetMapping("/4lista/{id}")
	public Salidas verUno(@PathVariable Long id) {
		return salidasService.verUno(id);
	}

	@PostMapping("/4registrar")
	public Salidas registar(@RequestBody Salidas salidas){
		return salidasService.registrar(salidas);
	}

	@PutMapping("/4actualizar/{id}")
	public Salidas actualizar(@RequestBody Salidas salidas, @PathVariable Long id){
		return salidasService.actualizar(salidas,id);
	}

	@DeleteMapping("/4eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		salidasService.eliminar(id);
	}
    

}
