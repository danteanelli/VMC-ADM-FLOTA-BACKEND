package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.Chofer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IChoferDAO extends JpaRepository<Chofer, Long> {
}
