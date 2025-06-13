package com.docker_curso.__inmueble.service;



import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class InmuebleDTO {


    Long id;
    String nombre;
    String direccion;
    String fotoUrl;
    Double precio;
    LocalDate fechaCreacion;



}
