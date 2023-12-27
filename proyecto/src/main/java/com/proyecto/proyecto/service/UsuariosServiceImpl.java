package com.proyecto.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.UsuariosDao;
import com.proyecto.proyecto.entity.Usuarios;

@Service
public class UsuariosServiceImpl implements UsuariosService{
    @Autowired
    UsuariosDao usuariosDao;

    @Override
    public List<Usuarios> listar() {
        return (List<Usuarios>)usuariosDao.findAll();
    }

    @Override
    public Usuarios verUno(Long id) {

        return usuariosDao.findById(id).orElse(null);
    }

    @Override
    public Usuarios registrar(Usuarios usuarios) {

        return usuariosDao.save(usuarios);
        
    }

    @Override
    public Usuarios actualizar(Usuarios object, Long id) {
        Optional<Usuarios> objectExistenteOptional = usuariosDao.findById(id);
        if (objectExistenteOptional.isPresent()) {
			Usuarios usuariosExistente = objectExistenteOptional.get();

			usuariosExistente.setUser_password(object.getUser_password());
			usuariosExistente.setNombre(object.getNombre());
			usuariosExistente.setActivos(object.getActivos());
			usuariosExistente.setAdministrar(object.getAdministrar());
			usuariosExistente.setResportes(object.getResportes());
            
            return usuariosDao.save(usuariosExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        
        usuariosDao.findById(id);
    }
    
}
