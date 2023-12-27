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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="entradas_detalle")
public class Entradas_detalle extends BaseEntity{
    private int cantidad;
    private double precio_compra;
    private double igv;

    @ManyToOne /*(cascade = CascadeType.ALL,fetch = FetchType.LAZY)*/
    @JoinColumn(name="id_articulo")
    private Articulos articulos;

    @ManyToOne /*(cascade = CascadeType.ALL,fetch = FetchType.LAZY)*/
    @JoinColumn(name="id_entrada")
    private Entradas entradas; 
}
