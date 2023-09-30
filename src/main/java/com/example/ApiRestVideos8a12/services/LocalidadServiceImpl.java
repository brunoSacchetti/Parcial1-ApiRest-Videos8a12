package com.utn.EjApiRestVideo8a12.services;

import com.utn.EjApiRestVideo8a12.entities.Localidad;
import com.utn.EjApiRestVideo8a12.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{
    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository) {
        super(baseRepository);
    }
}
