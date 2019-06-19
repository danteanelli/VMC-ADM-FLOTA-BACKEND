package com.sistemavehiculos.rest;

import com.sistemavehiculos.models.entity.Usuario;
import com.sistemavehiculos.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 *
 */
@CrossOrigin(origins = { "http://localhost:4200", "*" })
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/usuarios")
    public List<Usuario> index() {
        return usuarioService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/usuarios/{id}")
    public Usuario show(@PathVariable Long id) {
        return usuarioService.findById(id);
    }

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuario.setHabilitado(true);
        usuario.setCreatedAt(new Date());
        usuario.setUpdatedAt(new Date());
        return usuarioService.save(usuario);
    }

}
