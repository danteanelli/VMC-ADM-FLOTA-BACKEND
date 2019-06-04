package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.Perfil;

import java.util.List;

public interface IPerfilService {

    public List<Perfil> findAll();

    public Perfil findById(Long id);

    public Perfil save(Perfil perfil);

    public void delete(Long id);

}
