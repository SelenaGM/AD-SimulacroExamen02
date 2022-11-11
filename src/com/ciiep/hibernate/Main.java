package com.ciiep.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //RECUERDA QUE TIENES QUE DARTE AL DOCKER Y AQUI EN DATABASE + mysql -> root  toor
        //AÑADIR LAS LIBRERIAS DE MYSQL () E HIBERNATE (hibernate-core)
        Abonado abonado = new Abonado();
        abonado.setNombre("Manolito");
        Autor autor = new Autor();
        autor.setNombre("Javier");
        Libro libro = new Libro();
        libro.setTitulo("Por qué no dedicarse a la programación");
        Alquiler alquiler = new Alquiler();
        alquiler.setFecha(Date.valueOf(LocalDate.now()));

        abonado.getAlquileres().add(alquiler);
        libro.getAlquileres().add(alquiler);

        autor.getLibros().add(libro);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.persist(abonado);
        session.persist(autor);
        session.persist(libro);
        session.persist(alquiler);

        session.getTransaction().commit();
        session.close();




    }
}