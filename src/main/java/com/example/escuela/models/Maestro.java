package com.example.escuela.models;

public class Maestro extends Usuario {

    private String numeroEmpleado;

    public Maestro() {
    }

    public Maestro(String id, String nombre, String apellidos, String correoInstitucional, String contrasena, String numeroEmpleado) {
        super(id, nombre, apellidos, correoInstitucional, contrasena);
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
}
