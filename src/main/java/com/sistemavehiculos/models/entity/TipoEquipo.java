package com.sistemavehiculos.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sistemavehiculos.models.entity.superclase.General;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Entity
@Table(name = "tipos_equipos")
public class TipoEquipo extends General {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(mappedBy="tipoEquipo", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SubTipoEquipo> subTipoEquipos;

    /**
     * Constructor
     */
    public TipoEquipo() {
        this.subTipoEquipos = new ArrayList<>();
    }


    // GETTERS AND SETTERS
    /**
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return
     */
    public List<SubTipoEquipo> getSubTipoEquipos() {
        return subTipoEquipos;
    }

    /**
     * @param subTipoEquipos
     */
    public void setSubTipoEquipos(List<SubTipoEquipo> subTipoEquipos) {
        this.subTipoEquipos = subTipoEquipos;
    }

}
