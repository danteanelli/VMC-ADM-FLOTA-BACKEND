package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.ICentroDeCostoDAO;
import com.sistemavehiculos.models.entity.CentroDeCosto;
import com.sistemavehiculos.models.services.ICentroDeCostoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class CentroDeCostoServiceImp implements ICentroDeCostoService {

    @Autowired
    private ICentroDeCostoDAO centroDeCostoDAO;

    @Override
    @Transactional(readOnly = true)
    public List<CentroDeCosto> findAll() {
        return (List<CentroDeCosto>) centroDeCostoDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CentroDeCosto findById(Long id) {
        return centroDeCostoDAO.findById(id).orElse(null);
    }

    @Override
    public CentroDeCosto save(CentroDeCosto centroDeCosto) {
        return centroDeCostoDAO.save(centroDeCosto);
    }

    @Override
    public void delete(Long id) {
        centroDeCostoDAO.deleteById(id);
    }
}
