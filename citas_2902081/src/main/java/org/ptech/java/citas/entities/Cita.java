package org.ptech.java.citas.entities;

import java.sql.Time;
import java.text.spi.DateFormatSymbolsProvider;
import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.ptech.java.citas.entities.Enums.EstadoCita;

public class Cita {

    private int id;
    private LocalDateTime fecha;
    private Consultorio consultorio;
    Paciente paciente;


    public Cita() {
    }


    public Cita(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.paciente = paciente;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public Consultorio getConsultorio() {
        return consultorio;
    }


    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }


    public Paciente getPaciente() {
        return paciente;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    

    

}
