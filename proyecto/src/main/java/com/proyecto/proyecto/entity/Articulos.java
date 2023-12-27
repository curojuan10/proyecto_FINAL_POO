package com.proyecto.proyecto.entity;


import java.time.LocalDate;

import com.proyecto.proyecto.shared.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="articulos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Articulos extends BaseEntity{
    private String articulo;
    private LocalDate fecha_registro;
    private String localizacion;
    private String grupo;
    private String unidad_medida;
    private String existencia;
    private int cant_min;
    private double costo_promedio;



   /*  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "articulos")
    private List<Salidas_detalle>tres;

     @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "articulos")
    private List<Entradas_detalle>cuatro;*/

}
