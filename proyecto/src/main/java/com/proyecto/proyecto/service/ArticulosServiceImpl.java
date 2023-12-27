package com.proyecto.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyecto.dao.ArticulosDao;
import com.proyecto.proyecto.entity.Articulos;
@Service
public class ArticulosServiceImpl implements ArticulosService{
    @Autowired
    ArticulosDao articulosDao;

    @Override
    public List<Articulos> listar() {
       
        return (List<Articulos>) articulosDao.findAll();
    }

    @Override
    public Articulos verUno(Long id) {
        
        return articulosDao.findById(id).orElse(null);
    }

    @Override
    public Articulos registrar(Articulos articulos) {
       return articulosDao.save(articulos);
        
    }

    @Override
    public Articulos actualizar(Articulos articulos, Long id) {
        Optional<Articulos> objectExistenteOptional = articulosDao.findById(id);
        if (objectExistenteOptional.isPresent()) {
			Articulos articuloExistente = objectExistenteOptional.get();

			articuloExistente.setArticulo(articulos.getArticulo());
			articuloExistente.setFecha_registro(articulos.getFecha_registro());
			articuloExistente.setLocalizacion(articulos.getLocalizacion());
			articuloExistente.setGrupo(articulos.getGrupo());
			articuloExistente.setUnidad_medida(articulos.getUnidad_medida());
            articuloExistente.setExistencia(articulos.getExistencia());
            articuloExistente.setCant_min(articulos.getCant_min());
            articuloExistente.setCosto_promedio(articulos.getCosto_promedio());
        


            return articulosDao.save(articuloExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        
        articulosDao.deleteById(id);
    }
    
}
