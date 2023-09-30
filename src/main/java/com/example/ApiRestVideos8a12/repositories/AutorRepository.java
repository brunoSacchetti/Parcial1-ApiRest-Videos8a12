package com.utn.EjApiRestVideo8a12.repositories;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.utn.EjApiRestVideo8a12.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
