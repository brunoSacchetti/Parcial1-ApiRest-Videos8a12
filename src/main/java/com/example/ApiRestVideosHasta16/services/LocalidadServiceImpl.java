package com.example.ApiRestVideosHasta16.services;


import com.example.ApiRestVideosHasta16.entities.Localidad;
import com.example.ApiRestVideosHasta16.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{

    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository) {
        super(baseRepository);
    }
}
