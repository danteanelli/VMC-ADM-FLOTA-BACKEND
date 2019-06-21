package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.CentroDeCosto;
import com.sistemavehiculos.models.services.ICentroDeCostoService;
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
public class CentroDeCostoController {

    @Autowired
    private ICentroDeCostoService centroDeCostoService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/choferes")
    public List<CentroDeCosto> index() {
        return centroDeCostoService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/choferes/{id}")
    public CentroDeCosto show(@PathVariable Long id) {
        return centroDeCostoService.findById(id);
    }

    @PostMapping("/choferes")
    @ResponseStatus(HttpStatus.CREATED)
    public CentroDeCosto create(@RequestBody CentroDeCosto centroDeCosto) {
        centroDeCosto.setCreatedAt(new Date());
        centroDeCosto.setUpdatedAt(new Date());
        return centroDeCostoService.save(centroDeCosto);
    }

    @PutMapping("/choferes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public CentroDeCosto update(@RequestBody CentroDeCosto centroDeCosto, @PathVariable Long id) {
        CentroDeCosto centroDeCostoActual = centroDeCostoService.findById(id);

        centroDeCostoActual.setNroCentroCosto(centroDeCosto.getNroCentroCosto());
        centroDeCostoActual.setDescripcion(centroDeCosto.getDescripcion());
        centroDeCostoActual.setUpdatedAt(new Date());

        return centroDeCostoService.save(centroDeCostoActual);
    }

    @DeleteMapping("/choferes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        centroDeCostoService.delete(id);
    }
}
