package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.IMarcaDAO;
import com.sistemavehiculos.models.entity.Marca;
import com.sistemavehiculos.models.services.IMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class MarcaServiceImp implements IMarcaService {

    @Autowired
    private IMarcaDAO marcaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Marca> findAll() {
        return (List<Marca>) marcaDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Marca findById(Long id) {
        return marcaDAO.findById(id).orElse(null);
    }

    @Override
    public Marca save(Marca marca) {
        return marcaDAO.save(marca);
    }

    @Override
    public void delete(Long id) {
        marcaDAO.deleteById(id);
    }
}
