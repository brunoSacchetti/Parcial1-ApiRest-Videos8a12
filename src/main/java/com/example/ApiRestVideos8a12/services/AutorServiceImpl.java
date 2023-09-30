package com.utn.EjApiRestVideo8a12.services;

import com.utn.EjApiRestVideo8a12.entities.Autor;
import com.utn.EjApiRestVideo8a12.repositories.AutorRepository;
import com.utn.EjApiRestVideo8a12.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor,Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
