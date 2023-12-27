package com.proyecto.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.EntradasDao;
import com.proyecto.proyecto.entity.Entradas;

@Service
public class EntradasServiceImpl implements EntradasService{
    @Autowired
    EntradasDao entradasDao;

    @Override
    public List<Entradas> listar() {
        
        return (List<Entradas>) entradasDao.findAll();
    }

    @Override
    public Entradas verUno(Long id) {
       
        return entradasDao.findById(id).orElse(null);
    }

    @Override
    public Entradas registrar(Entradas entradas) {
        return entradasDao.save(entradas);
    }

    @Override
    public Entradas actualizar(Entradas entradas, Long id) {
        
        Optional<Entradas> objectExistenteOptional = entradasDao.findById(id);
        if (objectExistenteOptional.isPresent()) {
			Entradas entradaExistente = objectExistenteOptional.get();

			entradaExistente.setFecha_registro(entradas.getFecha_registro());
			entradaExistente.setProveedor(entradas.getProveedor());
			entradaExistente.setFolio_factura(entradas.getFolio_factura());
			entradaExistente.setFecha_factura(entradas.getFecha_factura());
			
            
            return entradasDao.save(entradaExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        entradasDao.findById(id);
    }
    
}
