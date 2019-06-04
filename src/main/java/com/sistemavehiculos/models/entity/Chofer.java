package com.sistemavehiculos.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sistemavehiculos.models.entity.superclase.General;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Entity
@Table(name = "choferes")
public class Chofer extends General {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String dni;

    private String fotoDNI;
    private String fotoLicenciaConducir;
    private Date vtoLicenciaConducir;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_licencia_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TipoLicencia tipoLicencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_licencia2_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TipoLicencia tipoLicencia2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_licencia3_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TipoLicencia tipoLicencia3;

    private String nroLlaveMicroTrack;


    /**
     *
     */
    public Chofer() {
    }

    /**
     * @param dni
     * @param fotoDNI
     * @param fotoLicenciaConducir
     * @param vtoLicenciaConducir
     * @param tipoLicencia
     * @param tipoLicencia2
     * @param tipoLicencia3
     * @param nroLlaveMicroTrack
     */
    public Chofer(String dni, String fotoDNI, String fotoLicenciaConducir, Date vtoLicenciaConducir, TipoLicencia tipoLicencia, TipoLicencia tipoLicencia2, TipoLicencia tipoLicencia3, String nroLlaveMicroTrack) {
        this.dni = dni;
        this.fotoDNI = fotoDNI;
        this.fotoLicenciaConducir = fotoLicenciaConducir;
        this.vtoLicenciaConducir = vtoLicenciaConducir;
        this.tipoLicencia = tipoLicencia;
        this.tipoLicencia2 = tipoLicencia2;
        this.tipoLicencia3 = tipoLicencia3;
        this.nroLlaveMicroTrack = nroLlaveMicroTrack;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFotoDNI() {
        return fotoDNI;
    }

    public void setFotoDNI(String fotoDNI) {
        this.fotoDNI = fotoDNI;
    }

    public String getFotoLicenciaConducir() {
        return fotoLicenciaConducir;
    }

    public void setFotoLicenciaConducir(String fotoLicenciaConducir) {
        this.fotoLicenciaConducir = fotoLicenciaConducir;
    }

    public Date getVtoLicenciaConducir() {
        return vtoLicenciaConducir;
    }

    public void setVtoLicenciaConducir(Date vtoLicenciaConducir) {
        this.vtoLicenciaConducir = vtoLicenciaConducir;
    }

    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(TipoLicencia tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public TipoLicencia getTipoLicencia2() {
        return tipoLicencia2;
    }

    public void setTipoLicencia2(TipoLicencia tipoLicencia2) {
        this.tipoLicencia2 = tipoLicencia2;
    }

    public TipoLicencia getTipoLicencia3() {
        return tipoLicencia3;
    }

    public void setTipoLicencia3(TipoLicencia tipoLicencia3) {
        this.tipoLicencia3 = tipoLicencia3;
    }

    public String getNroLlaveMicroTrack() {
        return nroLlaveMicroTrack;
    }

    public void setNroLlaveMicroTrack(String nroLlaveMicroTrack) {
        this.nroLlaveMicroTrack = nroLlaveMicroTrack;
    }
}
