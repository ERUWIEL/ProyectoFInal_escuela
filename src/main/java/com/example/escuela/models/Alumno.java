package com.example.escuela.models;

public class Alumno extends Usuario {

    private String matricula;

    public Alumno() {
    }

    public Alumno(String id, String nombre, String apellidos, String correoInstitucional, String contrasena, String matricula) {
        super(id, nombre, apellidos, correoInstitucional, contrasena);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
