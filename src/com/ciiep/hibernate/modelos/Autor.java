package com.ciiep.hibernate.modelos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "autor")
public class Autor implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    //lo tenemos que llamar como hemos llamado al mismo atributo en la clase con la que se relaciona
    @OneToMany(mappedBy = "autor")
    private ArrayList<Libro> libros;

    public Autor() {
        libros = new ArrayList<>();
    }

    public Autor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        libros = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
