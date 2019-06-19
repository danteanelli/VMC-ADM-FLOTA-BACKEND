package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.ITallerDAO;
import com.sistemavehiculos.models.entity.Taller;
import com.sistemavehiculos.models.services.ITallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class TallerServiceImp implements ITallerService {

    @Autowired
    private ITallerDAO tallerDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Taller> findAll() {
        return (List<Taller>) tallerDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Taller findById(Long id) {
        return tallerDAO.findById(id).orElse(null);
    }

    @Override
    public Taller save(Taller taller) {
        return tallerDAO.save(taller);
    }

    @Override
    public void delete(Long id) {
        tallerDAO.deleteById(id);
    }
}
