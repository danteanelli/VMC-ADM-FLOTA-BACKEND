package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.Vehiculo;

import java.util.List;

/**
 *
 */
public interface IVehiculoService {

    public List<Vehiculo> findAll();

    public Vehiculo findById(Long id);

    public Vehiculo save(Vehiculo vehiculo);

    public void delete(Long id);

}
