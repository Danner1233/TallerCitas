package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Enums.EstadoCita;
import org.ptech.java.citas.interfaces.IAgendable;

public class CitaEnfermero extends Cita implements IAgendable {

    Enfermero enferme;
    EstadoCita estado;

    public CitaEnfermero(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente, Enfermero enferme,
            EstadoCita estado) {
        super(id, fecha, consultorio, paciente);
        this.enferme = enferme;
        this.estado = EstadoCita.AGENDADA;
    }


    public Enfermero getEnferme() {
        return this.enferme;
    }

    public void setEnferme(Enfermero enferme) {
        this.enferme = enferme;
    }

    public EstadoCita getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {


        this.setFecha(fecha);
        this.setConsultorio(c);
        return true;
    }
    @Override
    public boolean reagendarCita(LocalDateTime nuevaFecha, Consultorio nuevac) {

        this.setFecha(nuevaFecha);
        this.setConsultorio(nuevac);
        return true;
    }
    @Override
    public boolean cancelarCita() {

        this.estado = EstadoCita.CANCELADA;
        return true;

    }
    
}
