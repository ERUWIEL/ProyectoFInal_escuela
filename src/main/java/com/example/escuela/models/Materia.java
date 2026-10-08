package com.example.escuela.models;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String id;
    private String clave;
    private String nombre;
    private String descripcion;
    private int creditos;
    private int cupoMaximo;
    private int cupoOcupado;
    private Maestro maestro;
    private PeriodoEscolar periodo;
    private List<Horario> horarios = new ArrayList<>();

    public Materia() {
    }

    public Materia(String id, String clave, String nombre, String descripcion, int creditos, int cupoMaximo, int cupoOcupado, Maestro maestro, PeriodoEscolar periodo, List<Horario> horarios) {
        this.id = id;
        this.clave = clave;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.cupoMaximo = cupoMaximo;
        this.cupoOcupado = cupoOcupado;
        this.maestro = maestro;
        this.periodo = periodo;
        this.horarios = horarios;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getCupoOcupado() {
        return cupoOcupado;
    }

    public void setCupoOcupado(int cupoOcupado) {
        this.cupoOcupado = cupoOcupado;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public PeriodoEscolar getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoEscolar periodo) {
        this.periodo = periodo;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }


    public boolean tieneCupo() {
        return cupoOcupado < cupoMaximo;
    }

    public boolean seTraslapaCon(Materia otra) {
        for (Horario a : horarios) {
            for (Horario b : otra.horarios) {
                if (a.seTraslapaCon(b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
