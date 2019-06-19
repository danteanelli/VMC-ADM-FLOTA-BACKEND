package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.ITipoEquipoDAO;
import com.sistemavehiculos.models.entity.TipoEquipo;
import com.sistemavehiculos.models.services.ITipoEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class TipoEquipoServiceImp implements ITipoEquipoService {

    @Autowired
    private ITipoEquipoDAO tipoEquipoDao;

    @Override
    @Transactional(readOnly = true)
    public List<TipoEquipo> findAll() {
        return (List<TipoEquipo>) tipoEquipoDao.findAll();
    }

    @Override
    public TipoEquipo findById(Long id) {
        return tipoEquipoDao.findById(id).orElse(null);
    }

    @Override
    public TipoEquipo save(TipoEquipo tipoEquipo) {
        return tipoEquipoDao.save(tipoEquipo);
    }

    @Override
    public void delete(Long id) {
        tipoEquipoDao.deleteById(id);
    }
}
