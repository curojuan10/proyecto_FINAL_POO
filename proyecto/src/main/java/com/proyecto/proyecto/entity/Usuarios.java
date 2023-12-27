package com.proyecto.proyecto.entity;

import java.time.LocalDate;

import com.proyecto.proyecto.shared.BaseEntity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="usuarios")
@Getter
@Setter
@NoArgsConstructor
public class Usuarios extends BaseEntity {
    private String user_password;
    private String nombre;
    private LocalDate fecha_nacimiento;
    private String activos;
    private String administrar;
    private String resportes;
    

   /* @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "usuarios")
    private List<Entradas>uno;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "usuarios")
    private List<Salidas>dos;*/
}
