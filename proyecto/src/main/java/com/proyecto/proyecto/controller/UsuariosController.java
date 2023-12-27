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

import com.proyecto.proyecto.entity.Usuarios;
import com.proyecto.proyecto.service.UsuariosService;

@RestController
public class UsuariosController {
    @Autowired
    UsuariosService usuariosService;
    
     @GetMapping("/5lista")
	public List<Usuarios> verTodo() {
		return usuariosService.listar();
	}

	@GetMapping("/5lista/{id}")
	public Usuarios verUno(@PathVariable Long id) {
		return usuariosService.verUno(id);
	}

	@PostMapping("/5registrar")
	public Usuarios registar(@RequestBody Usuarios usuarios){
		return usuariosService.registrar(usuarios);
	}

	@PutMapping("/5actualizar/{id}")
	public Usuarios actualizar(@RequestBody Usuarios usuarios, @PathVariable Long id){
		return usuariosService.actualizar(usuarios,id);
	}

	@DeleteMapping("/5eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		usuariosService.eliminar(id);
	}
    
}
