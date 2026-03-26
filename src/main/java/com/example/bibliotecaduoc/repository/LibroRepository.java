package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    // arreglo que guardara todos los libros
    private List<Libro> listaLibros = new ArrayList<>();

    // metodo que retornara todos los libros
    public List<Libro> obtenerLibros(){
        return listaLibros;
    }
    
    //metodo que busca un libro por id
    public Libro buscarPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    //metodo que busca un libro por isbn
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }










}   
