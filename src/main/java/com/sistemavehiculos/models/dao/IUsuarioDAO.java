package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {

    public Usuario findByEmail(String email);


}
