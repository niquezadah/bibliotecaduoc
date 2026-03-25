package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    // arreglo que guardara los libros
    private List<Libro> listaLibros = new ArrayList<>();

    // metodo que retorna los libros
    public List<Libro> obtenerLibros(){
        return listaLibros;
    }
    
}
