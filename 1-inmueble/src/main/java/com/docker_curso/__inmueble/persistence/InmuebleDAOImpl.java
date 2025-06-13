package com.docker_curso.__inmueble.persistence;

import com.docker_curso.__inmueble.model.Inmueble;
import com.docker_curso.__inmueble.respository.InmuebleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InmuebleDAOImpl implements InmuebleDAO{

     @Autowired
     private InmuebleRepository inmuebleRepository;


    @Override
    public List<Inmueble> getAllInmuebles() {
        return this.inmuebleRepository.findAll();
    }

    @Override
    public Inmueble getInmuebleById(Long id) {
        return this.inmuebleRepository.findById(id).orElseThrow();
    }

    @Override
    public Inmueble getInmuebleByName(String nombre) {
        return this.inmuebleRepository.getInmuebleByName(nombre);
    }

    @Override
    public Inmueble getInmuebleByAdress(String direccion) {
        return this.inmuebleRepository.getInmuebleByAdress(direccion);
    }

    @Override
    public void saveInmueble(Inmueble inmueble) {

        this.inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(Long id) {
      this.inmuebleRepository.deleteById(id);
    }
}
