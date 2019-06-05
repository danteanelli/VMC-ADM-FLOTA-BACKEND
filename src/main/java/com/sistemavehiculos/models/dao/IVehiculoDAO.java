package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.Vehiculo;
import org.springframework.data.repository.CrudRepository;

public interface IVehiculoDAO extends CrudRepository<Vehiculo, Long> {

}
