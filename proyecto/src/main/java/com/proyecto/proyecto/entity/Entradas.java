package com.proyecto.proyecto.entity;

import java.time.LocalDate;

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
@Table(name="entradas")
public class Entradas extends BaseEntity{
    private LocalDate fecha_registro;
    private LocalDate fecha_entrada;
    private String proveedor;
    private int folio_factura;
    private LocalDate fecha_factura;

    @ManyToOne /*(cascade = CascadeType.ALL,fetch = FetchType.LAZY)*/
    @JoinColumn(name="user_login")
    private Usuarios usuarios;

   /*  @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY,mappedBy = "entradas")
    private List<Entradas_detalle>cinco;*/

}
