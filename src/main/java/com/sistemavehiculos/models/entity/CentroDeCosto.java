package com.sistemavehiculos.models.entity;

import com.sistemavehiculos.models.entity.superclase.General;

import javax.persistence.*;

@Entity
@Table(name = "centro_de_costos")
public class CentroDeCosto extends General {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
