package com.proyecto.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.Entrada_detalleDao;
import com.proyecto.proyecto.entity.Entradas_detalle;

@Service
public class Entradas_detaServiceImpl implements Entradas_detalleService{
    @Autowired
    Entrada_detalleDao detalleDao;

    @Override
    public List<Entradas_detalle> listar() {
        return (List<Entradas_detalle>) detalleDao.findAll();
    }

    @Override
    public Entradas_detalle verUno(Long id) {
        
        return detalleDao.findById(id).orElse(null);
    }

    @Override
    public Entradas_detalle registrar(Entradas_detalle detalle) {
        
        return detalleDao.save(detalle);
    }

    @Override
    public Entradas_detalle actualizar(Entradas_detalle detalle, Long id) {
        Optional<Entradas_detalle> objectExistenteOptional = detalleDao.findById(id);
        if (objectExistenteOptional.isPresent()) {
			Entradas_detalle entradasExistente = objectExistenteOptional.get();

			entradasExistente.setCantidad(detalle.getCantidad());
			entradasExistente.setPrecio_compra(detalle.getPrecio_compra());
			entradasExistente.setIgv(detalle.getIgv());
            
            return detalleDao.save(entradasExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        
        detalleDao.findById(id);
    }


    
}
