package com.ciiep.hibernate.modelos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;


//Las clases tienen que tener el implement serializable y un constructor vacio
@Entity
@Table (name = "libro")
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;
    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Alquiler> alquiler;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public ArrayList<Alquiler> getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(ArrayList<Alquiler> alquiler) {
        this.alquiler = alquiler;
    }



    public Libro() {
        alquiler = new ArrayList<>();
    }

    public Libro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        alquiler = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
