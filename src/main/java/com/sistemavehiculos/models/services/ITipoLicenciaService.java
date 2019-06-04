package com.sistemavehiculos.models.services;

import com.sistemavehiculos.models.entity.TipoLicencia;

import java.util.List;

public interface ITipoLicenciaService {

    public List<TipoLicencia> findAll();

    public TipoLicencia findById(Long id);

    public TipoLicencia save(TipoLicencia tipoLicencia);

    public void delete(Long id);
}
