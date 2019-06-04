package com.sistemavehiculos.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sistemavehiculos.models.entity.superclase.General;

import javax.persistence.*;
import java.util.Date;

/**
 *
 */
@Entity
@Table(name = "vehiculos")
public class Vehiculo extends General {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_equipo_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TipoEquipo tipoEquipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subtipo_equipo_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private SubTipoEquipo subTipoEquipo;

    private String dominio;
    private String año;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marca_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Marca marca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modelo_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Modelo modelo;

    private String codigo;
    private String codigoQR;
    private String nroVin;
    private String nroChasis;
    private String nroMotor;
    private String nroPolizaSeguro;
    private String nroCertificacionVeritas;
    private Date vtoPolizaSeguro;
    private Date vtoVTV;
    private Date vtoBureauVerita;
    private String status;
    private String foto;
    private String trackingDispositivoID;
    private Double largo;
    private Double ancho;
    private Double tara;
    private Double alto;
    private Double capacidad;
    private Integer cantidadEje;
    private String neumatico;
    private String observaciones;

    /**
     *
     */
    public Vehiculo() {
    }

    /**
     * @param id
     * @param tipoEquipo
     * @param subTipoEquipo
     * @param dominio
     * @param año
     * @param marca
     * @param modelo
     * @param codigo
     * @param codigoQR
     * @param nroVin
     * @param nroChasis
     * @param nroMotor
     * @param nroPolizaSeguro
     * @param nroCertificacionVeritas
     * @param vtoPolizaSeguro
     * @param vtoVTV
     * @param vtoBureauVerita
     * @param status
     * @param foto
     * @param trackingDispositivoID
     * @param largo
     * @param ancho
     * @param tara
     * @param alto
     * @param capacidad
     * @param cantidadEje
     * @param neumatico
     * @param observaciones
     */
    public Vehiculo(Long id, TipoEquipo tipoEquipo, SubTipoEquipo subTipoEquipo, String dominio, String año, Marca marca, Modelo modelo, String codigo, String codigoQR, String nroVin, String nroChasis, String nroMotor, String nroPolizaSeguro, String nroCertificacionVeritas, Date vtoPolizaSeguro, Date vtoVTV, Date vtoBureauVerita, String status, String foto, String trackingDispositivoID, Double largo, Double ancho, Double tara, Double alto, Double capacidad, Integer cantidadEje, String neumatico, String observaciones) {
        this.id = id;
        this.tipoEquipo = tipoEquipo;
        this.subTipoEquipo = subTipoEquipo;
        this.dominio = dominio;
        this.año = año;
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
        this.codigoQR = codigoQR;
        this.nroVin = nroVin;
        this.nroChasis = nroChasis;
        this.nroMotor = nroMotor;
        this.nroPolizaSeguro = nroPolizaSeguro;
        this.nroCertificacionVeritas = nroCertificacionVeritas;
        this.vtoPolizaSeguro = vtoPolizaSeguro;
        this.vtoVTV = vtoVTV;
        this.vtoBureauVerita = vtoBureauVerita;
        this.status = status;
        this.foto = foto;
        this.trackingDispositivoID = trackingDispositivoID;
        this.largo = largo;
        this.ancho = ancho;
        this.tara = tara;
        this.alto = alto;
        this.capacidad = capacidad;
        this.cantidadEje = cantidadEje;
        this.neumatico = neumatico;
        this.observaciones = observaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoEquipo getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(TipoEquipo tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public SubTipoEquipo getSubTipoEquipo() {
        return subTipoEquipo;
    }

    public void setSubTipoEquipo(SubTipoEquipo subTipoEquipo) {
        this.subTipoEquipo = subTipoEquipo;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoQR() {
        return codigoQR;
    }

    public void setCodigoQR(String codigoQR) {
        this.codigoQR = codigoQR;
    }

    public String getNroVin() {
        return nroVin;
    }

    public void setNroVin(String nroVin) {
        this.nroVin = nroVin;
    }

    public String getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(String nroChasis) {
        this.nroChasis = nroChasis;
    }

    public String getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(String nroMotor) {
        this.nroMotor = nroMotor;
    }

    public String getNroPolizaSeguro() {
        return nroPolizaSeguro;
    }

    public void setNroPolizaSeguro(String nroPolizaSeguro) {
        this.nroPolizaSeguro = nroPolizaSeguro;
    }

    public String getNroCertificacionVeritas() {
        return nroCertificacionVeritas;
    }

    public void setNroCertificacionVeritas(String nroCertificacionVeritas) {
        this.nroCertificacionVeritas = nroCertificacionVeritas;
    }

    public Date getVtoPolizaSeguro() {
        return vtoPolizaSeguro;
    }

    public void setVtoPolizaSeguro(Date vtoPolizaSeguro) {
        this.vtoPolizaSeguro = vtoPolizaSeguro;
    }

    public Date getVtoVTV() {
        return vtoVTV;
    }

    public void setVtoVTV(Date vtoVTV) {
        this.vtoVTV = vtoVTV;
    }

    public Date getVtoBureauVerita() {
        return vtoBureauVerita;
    }

    public void setVtoBureauVerita(Date vtoBureauVerita) {
        this.vtoBureauVerita = vtoBureauVerita;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTrackingDispositivoID() {
        return trackingDispositivoID;
    }

    public void setTrackingDispositivoID(String trackingDispositivoID) {
        this.trackingDispositivoID = trackingDispositivoID;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getCantidadEje() {
        return cantidadEje;
    }

    public void setCantidadEje(Integer cantidadEje) {
        this.cantidadEje = cantidadEje;
    }

    public String getNeumatico() {
        return neumatico;
    }

    public void setNeumatico(String neumatico) {
        this.neumatico = neumatico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
