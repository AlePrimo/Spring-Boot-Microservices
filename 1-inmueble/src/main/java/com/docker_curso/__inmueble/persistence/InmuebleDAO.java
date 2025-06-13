package com.docker_curso.__inmueble.persistence;

import com.docker_curso.__inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleDAO {

    List<Inmueble> getAllInmuebles();
    Inmueble getInmuebleById(Long id);
    void  saveInmueble(Inmueble inmueble);
    void deleteInmueble(Long id);





}
