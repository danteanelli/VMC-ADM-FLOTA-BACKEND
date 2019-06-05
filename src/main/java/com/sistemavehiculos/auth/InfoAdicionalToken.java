package com.sistemavehiculos.auth;

import com.sistemavehiculos.models.entity.Usuario;
import com.sistemavehiculos.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InfoAdicionalToken implements TokenEnhancer {

    @Autowired
    private IUsuarioService usuarioService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

        Usuario usuario = usuarioService.findByEmail(authentication.getName());

        Map<String, Object> informacion = new HashMap<>();
        informacion.put("nombre", usuario.getNombre());
        informacion.put("apellido", usuario.getApellido());
        informacion.put("email", usuario.getEmail());
        informacion.put("empresa", usuario.getEmpresa());
        //informacion.put("perfil", usuario.getPerfiles());

        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(informacion);

        return accessToken;
    }
}
