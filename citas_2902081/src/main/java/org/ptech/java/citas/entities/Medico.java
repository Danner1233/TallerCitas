package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.Enums.Especialidad;
import org.ptech.java.citas.entities.Enums.TipoDocumento;

public class Medico extends Usuario {

    private Long registroMedico;
    private Especialidad especialidad;

    //reescribir

    

    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion,
            Long registroMedico, Especialidad especialidad) {

            
        super(id, nombres, apellidos, tipoDocumento, numeroIdentificacion);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + "]" + ", nombre: " + super.nombres;
    }

    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion) {
        super(id, nombres, apellidos, tipoDocumento, numeroIdentificacion);
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

}

