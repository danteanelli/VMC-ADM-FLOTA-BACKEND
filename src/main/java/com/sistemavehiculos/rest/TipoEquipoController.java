package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.TipoEquipo;
import com.sistemavehiculos.models.services.ITipoEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoEquipoController {

    @Autowired
    private ITipoEquipoService tipoEquipoService;

    @GetMapping("/tiposequipos")
    public List<TipoEquipo> index() {
        return tipoEquipoService.findAll();
    }

}
