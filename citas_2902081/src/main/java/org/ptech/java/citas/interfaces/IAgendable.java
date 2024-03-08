package org.ptech.java.citas.interfaces;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Consultorio;



public interface IAgendable {

    //PProponer un metodo para agendar la cita

    public boolean agendarCita(LocalDateTime fecha , Consultorio c);

    public boolean reagendarCita(LocalDateTime nuevaFecha , Consultorio nuevoc);

    public boolean cancelarCita();

}
