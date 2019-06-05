package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.Modelo;
import org.springframework.data.repository.CrudRepository;

public interface IModeloDAO extends CrudRepository<Modelo, Long> {
}
