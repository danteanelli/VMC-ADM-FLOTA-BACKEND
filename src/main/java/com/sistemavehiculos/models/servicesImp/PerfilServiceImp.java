package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.IPerfilDAO;
import com.sistemavehiculos.models.entity.Perfil;
import com.sistemavehiculos.models.services.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class PerfilServiceImp implements IPerfilService {

    @Autowired
    private IPerfilDAO perfilDAO;

    /**
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<Perfil> findAll() {
        return (List<Perfil>) perfilDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Perfil findById(Long id) {
        return perfilDAO.findById(id).orElse(null);
    }

    @Override
    public Perfil save(Perfil perfil) {
        return perfilDAO.save(perfil);
    }

    @Override
    public void delete(Long id) {
        perfilDAO.deleteById(id);
    }
}
