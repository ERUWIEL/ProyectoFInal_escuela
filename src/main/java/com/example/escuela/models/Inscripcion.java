package com.example.escuela.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

    private String id;
    private LocalDateTime fechaRegistro;
    private Alumno alumno;
    private PeriodoEscolar periodo;
    private List<Materia> materias = new ArrayList<>();

    public Inscripcion() {
    }

    public Inscripcion(String id, LocalDateTime fechaRegistro, Alumno alumno, PeriodoEscolar periodo, List<Materia> materias) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.alumno = alumno;
        this.periodo = periodo;
        this.materias = materias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public PeriodoEscolar getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoEscolar periodo) {
        this.periodo = periodo;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }


    public void agregarMateria(Materia materia) {
        if (!periodo.isInscripcionAbierta()) {
            throw new IllegalStateException("La inscripcion no esta abierta para este periodo.");
        }
        if (!materia.getPeriodo().getId().equals(periodo.getId())) {
            throw new IllegalArgumentException(materia.getClave() + " no pertenece a este periodo.");
        }
        for (Materia m : materias) {
            if (m.getId().equals(materia.getId())) {
                throw new IllegalStateException(materia.getClave() + " ya esta en la carga.");
            }
            if (m.seTraslapaCon(materia)) {
                throw new IllegalStateException(materia.getClave() + " se traslapa con " + m.getClave() + ".");
            }
        }
        if (!materia.tieneCupo()) {
            throw new IllegalStateException(materia.getClave() + " no tiene cupo.");
        }
        materias.add(materia);
        materia.setCupoOcupado(materia.getCupoOcupado() + 1);
    }

    public int totalCreditos() {
        int total = 0;
        for (Materia m : materias) {
            total += m.getCreditos();
        }
        return total;
    }
}
