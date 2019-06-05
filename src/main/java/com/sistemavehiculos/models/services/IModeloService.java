package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.Modelo;

import java.util.List;

public interface IModeloService {

    public List<Modelo> findAll();

    public Modelo findById(Long id);

    public Modelo save(Modelo modelo);

    public void delete(Long id);
}
