package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.IModeloDAO;
import com.sistemavehiculos.models.entity.Modelo;
import com.sistemavehiculos.models.services.IModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class ModeloServiceImp implements IModeloService {

    @Autowired
    private IModeloDAO modeloDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Modelo> findAll() {
        return (List<Modelo>) modeloDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Modelo findById(Long id) {
        return modeloDAO.findById(id).orElse(null);
    }

    @Override
    public Modelo save(Modelo modelo) {
        return modeloDAO.save(modelo);
    }

    @Override
    public void delete(Long id) {
        modeloDAO.deleteById(id);
    }
}
