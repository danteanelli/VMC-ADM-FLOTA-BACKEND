package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.Chofer;
import org.springframework.data.repository.CrudRepository;

public interface IChoferDAO extends CrudRepository<Chofer, Long> {
}
