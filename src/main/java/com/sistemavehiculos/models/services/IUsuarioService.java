package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.Usuario;

import java.util.List;

/**
 *
 */
public interface IUsuarioService {

    public Usuario findByEmail(String email);

    public List<Usuario> findAll();

    public Usuario findById(Long id);

    public Usuario save(Usuario usuario);

    public void delete(Long id);
}
