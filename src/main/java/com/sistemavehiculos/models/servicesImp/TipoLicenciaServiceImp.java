package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.ITipoLicenciaDAO;
import com.sistemavehiculos.models.entity.TipoLicencia;
import com.sistemavehiculos.models.services.ITipoLicenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class TipoLicenciaServiceImp implements ITipoLicenciaService {

    @Autowired
    private ITipoLicenciaDAO tipoLicenciaDAO;

    /**
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<TipoLicencia> findAll() {
        return (List<TipoLicencia>) tipoLicenciaDAO.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public TipoLicencia findById(Long id) {
        return tipoLicenciaDAO.findById(id).orElse(null);
    }

    /**
     * @param tipoLicencia
     * @return
     */
    @Override
    public TipoLicencia save(TipoLicencia tipoLicencia) {
        return tipoLicenciaDAO.save(tipoLicencia);
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        tipoLicenciaDAO.deleteById(id);
    }
}
