package com.docker_curso.__inmueble.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Entity
@Table(name = "inmueble")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Inmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "nombre", length = 150, nullable = false)
    String nombre;
    @Column(name = "direccion", length = 500, nullable = false)
    String direccion;
    @Column(name = "foto_url", length = 1200, nullable = true)
    String fotoUrl;
    @Column(name = "precio", nullable = false)
    Double precio;
    @Column(name = "fecha_creacion", nullable = false)
    LocalDate fechaCreacion;






}
