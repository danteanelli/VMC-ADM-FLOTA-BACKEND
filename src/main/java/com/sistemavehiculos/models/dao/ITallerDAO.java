package com.sistemavehiculos.models.dao;

import com.sistemavehiculos.models.entity.Taller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITallerDAO extends JpaRepository<Taller, Long> {
}
