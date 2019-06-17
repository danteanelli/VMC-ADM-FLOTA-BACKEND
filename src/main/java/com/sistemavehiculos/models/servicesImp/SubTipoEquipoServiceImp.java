package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.ISubTipoEquipoDAO;
import com.sistemavehiculos.models.entity.SubTipoEquipo;
import com.sistemavehiculos.models.services.ISubTipoEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class SubTipoEquipoServiceImp implements ISubTipoEquipoService {

    @Autowired
    private ISubTipoEquipoDAO subTipoEquipoDAO;

    @Override
    @Transactional(readOnly = true)
    public List<SubTipoEquipo> findAll() {
        return (List<SubTipoEquipo>) subTipoEquipoDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public SubTipoEquipo findById(Long id) {
        return subTipoEquipoDAO.findById(id).orElse(null);
    }

    @Override
    public SubTipoEquipo save(SubTipoEquipo subTipoEquipo) {
        return subTipoEquipoDAO.save(subTipoEquipo);
    }

    @Override
    public void delete(Long id) {
        subTipoEquipoDAO.deleteById(id);
    }
}
