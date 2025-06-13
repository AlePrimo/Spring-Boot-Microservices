package com.docker_curso.__inmueble.service;

import com.docker_curso.__inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleService {


    List<Inmueble> getAllInmuebles();
    Inmueble getInmuebleById(Long id);
    Inmueble getInmuebleByName(String nombre);
    Inmueble getInmuebleByAdress(String direccion);
    void  saveInmueble(Inmueble inmueble);
    void deleteInmueble(Long id);


}
