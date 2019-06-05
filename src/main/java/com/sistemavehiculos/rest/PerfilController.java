package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.Perfil;
import com.sistemavehiculos.models.services.IPerfilService;
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
public class PerfilController {

    @Autowired
    private IPerfilService perfilService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/perfiles")
    public List<Perfil> index() {
        return perfilService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/perfiles/{id}")
    public Perfil show(@PathVariable Long id) {
        return perfilService.findById(id);
    }

    @PostMapping("/perfiles")
    @ResponseStatus(HttpStatus.CREATED)
    public Perfil create(@RequestBody Perfil perfil) {
        perfil.setCreatedAt(new Date());
        perfil.setUpdatedAt(new Date());
        return perfilService.save(perfil);
    }

    @PutMapping("/perfiles/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Perfil update(@RequestBody Perfil perfil, @PathVariable Long id) {
        Perfil perfilActual = perfilService.findById(id);

        perfilActual.setNombre(perfil.getNombre());
        perfilActual.setUpdatedAt(new Date());

        return perfilService.save(perfilActual);
    }

    @DeleteMapping("/perfiles/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        perfilService.delete(id);
    }



}
