package com.proyecto.proyecto.entity;


import java.time.LocalDate;

import com.proyecto.proyecto.shared.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="salidas")
@Getter
@Setter
@NoArgsConstructor
public class Salidas extends BaseEntity{
    private LocalDate fecha_registro;
    private LocalDate fecha_salida;
    private String responsable;

    @ManyToOne /*(cascade = CascadeType.ALL,fetch = FetchType.LAZY)*/
    @JoinColumn(name="user_login")
    private Usuarios usuarios;

   /* @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "salidas")
    private List<Salidas_detalle>seis;*/
}
