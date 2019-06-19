package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.Taller;
import com.sistemavehiculos.models.services.ITallerService;
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
public class TallerController {

    @Autowired
    private ITallerService tallerService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/talleres")
    public List<Taller> index() {
        return tallerService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/talleres/{id}")
    public Taller show(@PathVariable Long id) {
        return tallerService.findById(id);
    }

    @PostMapping("/talleres")
    @ResponseStatus(HttpStatus.CREATED)
    public Taller create(@RequestBody Taller taller) {
        taller.setCreatedAt(new Date());
        taller.setUpdatedAt(new Date());
        return tallerService.save(taller);
    }

    @PutMapping("/talleres/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Taller update(@RequestBody Taller taller, @PathVariable Long id) {
        Taller tallerActual = tallerService.findById(id);
        tallerActual.setNombre(taller.getNombre());
        tallerActual.setDireccion(taller.getDireccion());
        tallerActual.setTelefono(taller.getTelefono());
        tallerActual.setResponsable(taller.getResponsable());
        tallerActual.setCuit(taller.getCuit());
        tallerActual.setUpdatedAt(new Date());

        return tallerService.save(tallerActual);
    }

    @DeleteMapping("/talleres/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        tallerService.delete(id);
    }
}
