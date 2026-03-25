package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //genera los getters, setters, toString, equals, hashCode, constructor null o final
@AllArgsConstructor //genera constructores con argumentos requeridos para las clases
@NoArgsConstructor //generaconstructores SIN argumentos requeridos para las clases
public class Libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}
