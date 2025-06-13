package com.docker_curso.__inmueble.respository;

import com.docker_curso.__inmueble.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {
     Inmueble getInmuebleByName(String nombre);
     Inmueble getInmuebleByAdress(String direccion);
}
