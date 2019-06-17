package com.sistemavehiculos.models.servicesImp;

import com.sistemavehiculos.models.dao.IVehiculoDAO;
import com.sistemavehiculos.models.entity.Vehiculo;
import com.sistemavehiculos.models.services.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class VehiculoServiceImp implements IVehiculoService {

    @Autowired
    private IVehiculoDAO vehiculoDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Vehiculo> findAll() {
        return (List<Vehiculo>) vehiculoDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Vehiculo findById(Long id) {
        return vehiculoDAO.findById(id).orElse(null);
    }

    @Override
    public Vehiculo save(Vehiculo vehiculo) {
        return vehiculoDAO.save(vehiculo);
    }

    @Override
    public void delete(Long id) {
        vehiculoDAO.deleteById(id);
    }
}
