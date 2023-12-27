package com.proyecto.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.Salidas_detalleDao;
import com.proyecto.proyecto.entity.Salidas_detalle;
@Service
public class Salidas_detaServiceImpl implements Salidas_detalleService{

    @Autowired
    Salidas_detalleDao detalleDao;

    @Override
    public List<Salidas_detalle> listar() {
        
        return (List<Salidas_detalle>) detalleDao.findAll();
    }

    @Override
    public Salidas_detalle verUno(Long id) {
        
        return detalleDao.findById(id).orElse(null);
    }

    @Override
    public Salidas_detalle registrar(Salidas_detalle salidas_detalle) {
        return detalleDao.save(salidas_detalle);
    }

    @Override
    public Salidas_detalle actualizar(Salidas_detalle object, Long id) {
        Optional<Salidas_detalle> objectExistenteOptional = detalleDao.findById(id);
        if (objectExistenteOptional.isPresent()) {
			Salidas_detalle salidas_detalleExistente = objectExistenteOptional.get();

			salidas_detalleExistente.setCantidad(object.getCantidad());

            return detalleDao.save(salidas_detalleExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        
        detalleDao.findById(id);
    }

  
}
