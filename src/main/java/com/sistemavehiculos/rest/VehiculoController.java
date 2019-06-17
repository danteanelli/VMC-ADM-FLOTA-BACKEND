package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.Vehiculo;
import com.sistemavehiculos.models.services.IVehiculoService;
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
public class VehiculoController {

    @Autowired
    private IVehiculoService vehiculoService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/vehiculos")
    public List<Vehiculo> index() {
        return vehiculoService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/vehiculos/{id}")
    public Vehiculo show(@PathVariable Long id) {
        return vehiculoService.findById(id);
    }

    @PostMapping("/vehiculos")
    @ResponseStatus(HttpStatus.CREATED)
    public Vehiculo create(@RequestBody Vehiculo vehiculo) {
        vehiculo.setCreatedAt(new Date());
        vehiculo.setUpdatedAt(new Date());
        return vehiculoService.save(vehiculo);
    }

    @PutMapping("/vehiculos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Vehiculo update(@RequestBody Vehiculo vehiculo, @PathVariable Long id) {
        Vehiculo vehiculoActual = vehiculoService.findById(id);

        vehiculoActual.setTipoEquipo(vehiculo.getTipoEquipo());
        vehiculoActual.setUpdatedAt(new Date());

        return vehiculoService.save(vehiculoActual);
    }

    @DeleteMapping("/vehiculos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        vehiculoService.delete(id);
    }
}
