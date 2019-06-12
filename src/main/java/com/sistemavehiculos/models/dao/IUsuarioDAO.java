package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

    public Usuario findByEmail(String email);

}
