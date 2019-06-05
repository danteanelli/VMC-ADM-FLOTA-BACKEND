package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.Marca;
import com.sistemavehiculos.models.services.IMarcaService;
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
public class MarcaController {

    @Autowired
    private IMarcaService marcaService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/marcas")
    public List<Marca> index() {
        return marcaService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/marcas/{id}")
    public Marca show(@PathVariable Long id) {
        return marcaService.findById(id);
    }

    @PostMapping("/marcas")
    @ResponseStatus(HttpStatus.CREATED)
    public Marca create(@RequestBody Marca marca) {
        marca.setCreatedAt(new Date());
        marca.setUpdatedAt(new Date());
        return marcaService.save(marca);
    }

    @PutMapping("/marcas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Marca update(@RequestBody Marca perfil, @PathVariable Long id) {
        Marca marcaActual = marcaService.findById(id);

        marcaActual.setNombre(perfil.getNombre());
        marcaActual.setUpdatedAt(new Date());

        return marcaService.save(marcaActual);
    }

    @DeleteMapping("/marcas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        marcaService.delete(id);
    }
}
