package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.SubTipoEquipo;

import java.util.List;

/**
 *
 */
public interface ISubTipoEquipoService {

    public List<SubTipoEquipo> findAll();

    public SubTipoEquipo findById(Long id);

    public SubTipoEquipo save(SubTipoEquipo subTipoEquipo);

    public void delete(Long id);

}
