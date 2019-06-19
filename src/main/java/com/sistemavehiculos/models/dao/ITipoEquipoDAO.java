package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.TipoEquipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ITipoEquipoDAO extends JpaRepository<TipoEquipo, Long> {

}
