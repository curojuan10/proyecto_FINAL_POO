package com.proyecto.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.SalidasDao;
import com.proyecto.proyecto.entity.Salidas;

@Service
public class SalidasServiceImpl implements SalidasService{

    @Autowired
    SalidasDao salidasDao;

    @Override
    public List<Salidas> listar() {

        return (List<Salidas>) salidasDao.findAll();
    }

    @Override
    public Salidas verUno(Long id) {

        return salidasDao.findById(id).orElse(null);
    }

    @Override
    public Salidas registrar(Salidas salidas) {
        
        return salidasDao.save(salidas);
    }

    @Override
    public Salidas actualizar(Salidas object, Long id) {
        Optional<Salidas> objectExistenteOptional = salidasDao.findById(id);
        if (objectExistenteOptional.isPresent()) {
			Salidas salidasExistente = objectExistenteOptional.get();

			salidasExistente.setFecha_registro(object.getFecha_registro());
			salidasExistente.setFecha_salida (object.getFecha_salida());
			salidasExistente.setResponsable(object.getResponsable());
			
            
            return salidasDao.save(salidasExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        
        salidasDao.findById(id);
    }
    
}
