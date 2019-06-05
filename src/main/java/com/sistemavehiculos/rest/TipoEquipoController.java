package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.TipoEquipo;
import com.sistemavehiculos.models.services.ITipoEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 *
 */
@CrossOrigin(origins = { "http://localhost:4200", "*" })
@RestController
@RequestMapping("/api")
public class TipoEquipoController {

    @Autowired
    private ITipoEquipoService tipoEquipoService;

    @GetMapping("/tiposequipo")
    public List<TipoEquipo> index() {
        return tipoEquipoService.findAll();
    }

    @GetMapping("/tiposequipo/{id}")
    public TipoEquipo show(@PathVariable Long id) {
        return tipoEquipoService.findById(id);
    }

    @PostMapping("/tiposequipo")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoEquipo create(@RequestBody TipoEquipo tipoEquipo) {
        tipoEquipo.setCreatedAt(new Date());
        tipoEquipo.setUpdatedAt(new Date());
        return tipoEquipoService.save(tipoEquipo);
    }

    @PutMapping("/tiposequipo/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoEquipo update(@RequestBody TipoEquipo tipoEquipo, @PathVariable Long id) {
        TipoEquipo tipoEquipoActual = tipoEquipoService.findById(id);

        tipoEquipoActual.setNombre(tipoEquipo.getNombre());
        tipoEquipoActual.setUpdatedAt(new Date());

        return tipoEquipoService.save(tipoEquipoActual);
    }

    @DeleteMapping("/tiposequipo/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        tipoEquipoService.delete(id);
    }



}
