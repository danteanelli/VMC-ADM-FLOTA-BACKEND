package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.Taller;

import java.util.List;

/**
 *
 */
public interface ITallerService {

    public List<Taller> findAll();

    public Taller findById(Long id);

    public Taller save(Taller taller);

    public void delete(Long id);
}
