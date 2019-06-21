package com.sistemavehiculos.models.entity;

import com.sistemavehiculos.models.entity.superclase.General;

import javax.persistence.*;

@Entity
@Table(name = "centro_de_costos")
public class CentroDeCosto extends General {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nroCentroCosto;

    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNroCentroCosto() {
        return nroCentroCosto;
    }

    public void setNroCentroCosto(String nroCentroCosto) {
        this.nroCentroCosto = nroCentroCosto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
