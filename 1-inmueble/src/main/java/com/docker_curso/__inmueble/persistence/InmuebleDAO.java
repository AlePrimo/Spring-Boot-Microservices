package com.docker_curso.__inmueble.persistence;

import com.docker_curso.__inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleDAO {

    List<Inmueble> getAllInmuebles();
    Inmueble getInmuebleById(Long id);
    Inmueble getInmuebleByName(String nombre);
    Inmueble getInmuebleByAdress(String direccion);
    void  saveInmueble(Inmueble inmueble);
    void deleteInmueble(Long id);





}
