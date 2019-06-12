package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.Marca;

import java.util.List;

/**
 *
 */
public interface IMarcaService {

    public List<Marca> findAll();

    public Marca findById(Long id);

    public Marca save(Marca marca);

    public void delete(Long id);
}
