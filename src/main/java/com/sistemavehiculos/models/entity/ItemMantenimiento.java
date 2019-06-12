package com.sistemavehiculos.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "items_mantenimiento")
public class ItemMantenimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
