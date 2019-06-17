package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.SubTipoEquipo;
import com.sistemavehiculos.models.services.ISubTipoEquipoService;
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
public class SubTipoEquipoController {

    @Autowired
    private ISubTipoEquipoService subTipoEquipoService;

    @GetMapping("/subtiposequipo")
    public List<SubTipoEquipo> index() {
        return subTipoEquipoService.findAll();
    }

    @GetMapping("/subtiposequipo/{id}")
    public SubTipoEquipo show(@PathVariable Long id) {
        return subTipoEquipoService.findById(id);
    }

    @PostMapping("/subtiposequipo")
    @ResponseStatus(HttpStatus.CREATED)
    public SubTipoEquipo create(@RequestBody SubTipoEquipo subTipoEquipo) {
        subTipoEquipo.setCreatedAt(new Date());
        subTipoEquipo.setUpdatedAt(new Date());
        return subTipoEquipoService.save(subTipoEquipo);
    }

    @PutMapping("/subtiposequipo/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public SubTipoEquipo update(@RequestBody SubTipoEquipo subTipoEquipo, @PathVariable Long id) {
        SubTipoEquipo subTipoEquipoActual = subTipoEquipoService.findById(id);

        subTipoEquipoActual.setNombre(subTipoEquipo.getNombre());
        subTipoEquipoActual.setTipoEquipo(subTipoEquipo.getTipoEquipo());
        subTipoEquipoActual.setUpdatedAt(new Date());

        return subTipoEquipoService.save(subTipoEquipoActual);
    }

    @DeleteMapping("/subtiposequipo/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        subTipoEquipoService.delete(id);
    }
}
