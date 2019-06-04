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
}
