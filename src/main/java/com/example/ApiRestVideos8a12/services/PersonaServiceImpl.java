package com.utn.EjApiRestVideo8a12.services;

import com.utn.EjApiRestVideo8a12.entities.Persona;
import com.utn.EjApiRestVideo8a12.repositories.BaseRepository;
import com.utn.EjApiRestVideo8a12.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona,Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

}
