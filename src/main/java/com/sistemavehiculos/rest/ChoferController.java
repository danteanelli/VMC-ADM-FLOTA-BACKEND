package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.Chofer;
import com.sistemavehiculos.models.services.IChoferService;
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
public class ChoferController {

    @Autowired
    private IChoferService choferService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/choferes")
    public List<Chofer> index() {
        return choferService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/choferes/{id}")
    public Chofer show(@PathVariable Long id) {
        return choferService.findById(id);
    }

    @PostMapping("/choferes")
    @ResponseStatus(HttpStatus.CREATED)
    public Chofer create(@RequestBody Chofer chofer) {
        chofer.setCreatedAt(new Date());
        chofer.setUpdatedAt(new Date());
        return choferService.save(chofer);
    }

    @PutMapping("/choferes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Chofer update(@RequestBody Chofer chofer, @PathVariable Long id) {
        Chofer marcaActual = choferService.findById(id);

        marcaActual.setNroLlaveMicroTrack(chofer.getNroLlaveMicroTrack());
        marcaActual.setUpdatedAt(new Date());

        return choferService.save(marcaActual);
    }

    @DeleteMapping("/choferes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        choferService.delete(id);
    }
}
