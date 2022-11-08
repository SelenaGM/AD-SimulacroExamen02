package modelos;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private int id;
    private String nombre;
    private String apellidos;
    private List<Libro> libros;

    public Autor() {
        this.libros= new ArrayList<>();
    }

    public Autor(int id, String nombre, String apellidos, List<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.libros= new ArrayList<>();
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", libros=" + libros +
                '}';
    }
}
