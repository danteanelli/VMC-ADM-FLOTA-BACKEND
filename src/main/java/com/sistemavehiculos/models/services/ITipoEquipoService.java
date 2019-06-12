package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.TipoEquipo;

import java.util.List;

/**
 *
 */
public interface ITipoEquipoService {

    public List<TipoEquipo> findAll();

    public TipoEquipo findById(Long id);

    public TipoEquipo save(TipoEquipo tipoEquipo);

    public void delete(Long id);

}
