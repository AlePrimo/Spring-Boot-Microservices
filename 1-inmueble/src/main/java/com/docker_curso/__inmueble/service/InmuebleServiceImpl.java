package com.docker_curso.__inmueble.service;

import com.docker_curso.__inmueble.model.Inmueble;
import com.docker_curso.__inmueble.persistence.InmuebleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService{


    @Autowired
    private InmuebleDAO inmuebleDAO;

    @Override
    public List<Inmueble> getAllInmuebles() {
        return this.inmuebleDAO.getAllInmuebles();
    }

    @Override
    public Inmueble getInmuebleById(Long id) {
        return this.inmuebleDAO.getInmuebleById(id);
    }

    @Override
    public Inmueble getInmuebleByName(String nombre) {
        return this.inmuebleDAO.getInmuebleByName(nombre);
    }

    @Override
    public Inmueble getInmuebleByAdress(String direccion) {
        return this.inmuebleDAO.getInmuebleByAdress(direccion);
    }

    @Override
    public void saveInmueble(Inmueble inmueble) {
        this.inmuebleDAO.saveInmueble(inmueble);

    }

    @Override
    public void deleteInmueble(Long id) {
        this.inmuebleDAO.deleteInmueble(id);

    }
}
