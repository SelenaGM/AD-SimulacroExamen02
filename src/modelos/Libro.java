package modelos;

public class Libro {
    private int id;
    private String nombre;
    private int numPaginas;
    private Autor autor;

    public Libro() {
    }

    public Libro(int id, String nombre, int numPaginas, Autor autor) {
        this.id = id;
        this.nombre = nombre;
        this.numPaginas = numPaginas;
        this.autor = autor;
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

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", numPaginas=" + numPaginas +
                ", autor=" + autor +
                '}';
    }
}
