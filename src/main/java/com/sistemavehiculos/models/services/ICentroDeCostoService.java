package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.CentroDeCosto;

import java.util.List;

public interface ICentroDeCostoService {

    public List<CentroDeCosto> findAll();

    public CentroDeCosto findById(Long id);

    public CentroDeCosto save(CentroDeCosto centroDeCosto);

    public void delete(Long id);

}
