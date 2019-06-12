package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMarcaDAO extends JpaRepository<Marca, Long> {



}
