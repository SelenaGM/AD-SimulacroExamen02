create schema biblioteca;
use biblioteca;

create table libro(
                      id int auto_increment primary key ,
                      nombre varchar(50) not null,
                      num_paginas int not null,
                      id_autor int,
                      foreign key (id_autor) references autor(id)


);

create table autor(
                      id int auto_increment primary key ,
                      nombre varchar(50) not null,
                      apellidos varchar(50) not null

);

create table abonado (
                         id int auto_increment primary key ,
                         nombre varchar(50) not null,
                         apellidos varchar(50) not null

);

create table alquiler(
                         id int auto_increment primary key ,
                         nombre varchar(50) not null,
                         id_libro int,
                         foreign key (id_libro) references libro(id),
                         id_abonado int,
                         foreign key (id_abonado) references abonado(id)
);