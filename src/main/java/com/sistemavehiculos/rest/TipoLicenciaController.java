package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.TipoLicencia;
import com.sistemavehiculos.models.services.ITipoLicenciaService;
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
public class TipoLicenciaController {

    @Autowired
    private ITipoLicenciaService tipoLicenciaService;

    @GetMapping("/tiposlicencia")
    public List<TipoLicencia> index() {
        return tipoLicenciaService.findAll();
    }

    @GetMapping("/tiposlicencia/{id}")
    public TipoLicencia show(@PathVariable Long id) {
        return tipoLicenciaService.findById(id);
    }

    @PostMapping("/tiposlicencia")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoLicencia create(@RequestBody TipoLicencia tipoLicencia) {
        tipoLicencia.setCreatedAt(new Date());
        tipoLicencia.setUpdatedAt(new Date());
        return tipoLicenciaService.save(tipoLicencia);
    }

    @PutMapping("/tiposlicencia/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoLicencia update(@RequestBody TipoLicencia tipoLicencia, @PathVariable Long id) {
        TipoLicencia tipoLicenciaActual = tipoLicenciaService.findById(id);

        tipoLicenciaActual.setNombre(tipoLicencia.getNombre());
        tipoLicenciaActual.setDescripcion(tipoLicencia.getDescripcion());
        tipoLicenciaActual.setUpdatedAt(new Date());

        return tipoLicenciaService.save(tipoLicenciaActual);
    }

    @DeleteMapping("/tiposlicencia/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        tipoLicenciaService.delete(id);
    }
}
