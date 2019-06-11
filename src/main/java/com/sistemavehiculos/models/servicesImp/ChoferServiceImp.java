package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.IChoferDAO;
import com.sistemavehiculos.models.entity.Chofer;
import com.sistemavehiculos.models.services.IChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class ChoferServiceImp implements IChoferService {

    @Autowired
    private IChoferDAO choferDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Chofer> findAll() {
        return (List<Chofer>) choferDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Chofer findById(Long id) {
        return choferDAO.findById(id).orElse(null);
    }

    @Override
    public Chofer save(Chofer chofer) {
        return choferDAO.save(chofer);
    }

    @Override
    public void delete(Long id) {
        choferDAO.deleteById(id);
    }
}
