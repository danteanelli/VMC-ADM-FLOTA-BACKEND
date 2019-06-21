package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.CentroDeCosto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICentroDeCostoDAO extends JpaRepository<CentroDeCosto, Long> {
}
