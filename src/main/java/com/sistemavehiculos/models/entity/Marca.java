package com.sistemavehiculos.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sistemavehiculos.models.entity.superclase.General;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "marcas")
public class Marca extends General {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(mappedBy="marca", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Modelo> modelos;

    public Marca() {
    }

    public Marca(List<Modelo> modelos) {
        this.modelos = modelos;
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


}
