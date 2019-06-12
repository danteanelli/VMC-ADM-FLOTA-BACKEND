package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.Chofer;

import java.util.List;

/**
 *
 */
public interface IChoferService {

    public List<Chofer> findAll();

    public Chofer findById(Long id);

    public Chofer save(Chofer chofer);

    public void delete(Long id);
}
