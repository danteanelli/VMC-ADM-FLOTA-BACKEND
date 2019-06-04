package com.sistemavehiculos.models.entity;

import com.sistemavehiculos.models.entity.superclase.General;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "tipos_licencia")
public class TipoLicencia extends General {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;



    /**
     *
     */
    public TipoLicencia() {
    }

    /**
     * @param nombre
     * @param descripcion
     */
    public TipoLicencia(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
