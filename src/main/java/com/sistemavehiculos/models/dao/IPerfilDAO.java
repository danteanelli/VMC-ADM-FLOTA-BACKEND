package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.Perfil;
import org.springframework.data.repository.CrudRepository;

public interface IPerfilDAO extends CrudRepository<Perfil, Long> {
}
