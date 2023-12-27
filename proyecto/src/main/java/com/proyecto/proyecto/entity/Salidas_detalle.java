package com.proyecto.proyecto.entity;

import com.proyecto.proyecto.shared.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="salidas_detalle")
public class Salidas_detalle extends BaseEntity{
    private int cantidad;

     @ManyToOne
    @JoinColumn(name="id_articulo")
    private Articulos articulos;
    
   @ManyToOne /*(cascade = CascadeType.ALL,fetch = FetchType.LAZY)*/
    @JoinColumn(name="id_salida")
    private Salidas salidas;
}
