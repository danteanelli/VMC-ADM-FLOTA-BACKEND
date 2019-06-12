package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.Modelo;
import com.sistemavehiculos.models.services.IModeloService;
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
public class ModeloController {

    @Autowired
    private IModeloService modeloService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/modelos")
    public List<Modelo> index() {
        return modeloService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/modelos/{id}")
    public Modelo show(@PathVariable Long id) {
        return modeloService.findById(id);
    }

    @PostMapping("/modelos")
    @ResponseStatus(HttpStatus.CREATED)
    public Modelo create(@RequestBody Modelo modelo) {
        modelo.setCreatedAt(new Date());
        modelo.setUpdatedAt(new Date());
        return modeloService.save(modelo);
    }

    @PutMapping("/modelos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Modelo update(@RequestBody Modelo modelo, @PathVariable Long id) {
        Modelo modeloActual = modeloService.findById(id);

        modeloActual.setNombre(modelo.getNombre());
        modeloActual.setMarca(modelo.getMarca());
        modeloActual.setUpdatedAt(new Date());

        return modeloService.save(modeloActual);
    }

    @DeleteMapping("/modelos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        modeloService.delete(id);
    }
}
