package com.example.escuela.models;

import java.time.LocalTime;

import com.example.escuela.models.enums.DiaSemana;

public class Horario {

    private DiaSemana dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Horario() {
    }

    public Horario(DiaSemana dia, LocalTime horaInicio, LocalTime horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }


    public boolean seTraslapaCon(Horario otro) {
        return dia == otro.dia
                && horaInicio.isBefore(otro.horaFin)
                && otro.horaInicio.isBefore(horaFin);
    }
}
