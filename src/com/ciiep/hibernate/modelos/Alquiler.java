package com.ciiep.hibernate.modelos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
@Entity
@Table(name = "alquiler")
public class Alquiler implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Date fecha;

    @ManyToOne
    @JoinColumn (name = "id_abonado")
    //Las clases con las que se relaciona
    private Abonado abonado;

    @ManyToOne
    @JoinColumn(name = "id_libro")
    private Libro libro;

    public Alquiler() {
    }

    public Abonado getAbonado() {
        return abonado;
    }

    public void setAbonado(Abonado abonado) {
        this.abonado = abonado;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Alquiler(int id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
