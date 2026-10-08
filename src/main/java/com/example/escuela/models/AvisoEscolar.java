package com.example.escuela.models;

import java.time.LocalDateTime;

public class AvisoEscolar {

    private String id;
    private String titulo;
    private String contenido;
    private LocalDateTime fechaPublicacion;
    private Administrador autor;

    public AvisoEscolar() {
    }

    public AvisoEscolar(String id, String titulo, String contenido, LocalDateTime fechaPublicacion, Administrador autor) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Administrador getAutor() {
        return autor;
    }

    public void setAutor(Administrador autor) {
        this.autor = autor;
    }
}
