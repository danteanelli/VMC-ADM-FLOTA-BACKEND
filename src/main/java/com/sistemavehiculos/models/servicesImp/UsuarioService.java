package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.IUsuarioDAO;
import com.sistemavehiculos.models.entity.Perfil;
import com.sistemavehiculos.models.entity.Usuario;
import com.sistemavehiculos.models.services.IUsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 */
@Service
public class UsuarioService implements IUsuarioService, UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(UsuarioService.class);

    @Autowired
    private IUsuarioDAO usuarioDAO;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Usuario usuario = usuarioDAO.findByEmail(email);

        if(usuario == null) {
            logger.error("Error en el login: no existe el usuario '"+email+"' en el sistema!");
            throw new UsernameNotFoundException("Error en el login: no existe el usuario '"+email+"' en el sistema!");
        }

        /*List<GrantedAuthority> authorities = usuario.getPerfiles()
                .stream()
                .map(perfil -> new SimpleGrantedAuthority(perfil.getNombre()))
                .peek(authority -> logger.info("Perfil: " + authority.getAuthority()))
                .collect(Collectors.toList());*/

        List<GrantedAuthority> grantedAuthorities = getAuthorities(usuario);

        return new User(usuario.getEmail(), usuario.getPassword(), usuario.getHabilitado(), true, true, true, grantedAuthorities);
    }

    private List<GrantedAuthority> getAuthorities(Usuario usuario) {
        List<Perfil> perfilByUserId = usuario.getPerfiles();
        final List<GrantedAuthority> authorities = perfilByUserId.stream()
                .map(perfil -> new SimpleGrantedAuthority(perfil.getNombre()))
                .collect(Collectors.toList());
        return authorities;
    }

    @Override
    @Transactional(readOnly=true)
    public Usuario findByEmail(String email) {
        return usuarioDAO.findByEmail(email);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return usuarioDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findById(Long id) {
        return usuarioDAO.findById(id).orElse(null);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    @Override
    public void delete(Long id) {

    }
}
