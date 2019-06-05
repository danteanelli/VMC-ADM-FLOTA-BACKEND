package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.Marca;
import org.springframework.data.repository.CrudRepository;

public interface IMarcaDAO extends CrudRepository<Marca, Long> {
}
