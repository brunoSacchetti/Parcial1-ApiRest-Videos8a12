package com.utn.EjApiRestVideo8a12.controllers;

import com.utn.EjApiRestVideo8a12.entities.BaseEntidad;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends BaseEntidad, ID extends Serializable> {

    public ResponseEntity<?> getAll(); //? extiende de objeto

    public ResponseEntity<?> getOne(@PathVariable ID id);

    public ResponseEntity<?> save(@RequestBody E entity);

    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);

    public ResponseEntity<?> delete(@PathVariable ID id);




}
