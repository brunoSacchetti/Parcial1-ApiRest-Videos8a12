package com.example.ApiRestVideos8a12.services;


import com.example.ApiRestVideos8a12.entities.Localidad;
import com.example.ApiRestVideos8a12.repositories.BaseRepository;
import com.example.ApiRestVideos8a12.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{

    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository) {
        super(baseRepository);
    }
}
