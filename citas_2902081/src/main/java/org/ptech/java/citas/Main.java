package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.Usuario;
import org.ptech.java.citas.entities.Enums.Especialidad;
import org.ptech.java.citas.entities.Enums.EstadoCita;
import org.ptech.java.citas.entities.Enums.TipoDocumento;
import org.ptech.java.citas.entities.Enums.TipoSangre;

public class Main {
    public static void main(String[] args) {


        //Medico

        Medico m1 = new Medico(21, "Danner", "Arias", TipoDocumento.CC, 1085046484L, 3325232L, Especialidad.ONCOLOGIA);


        System.out.println("El nombre del medico es: " + m1.getNombres());


        //Enfermero

        Enfermero e = new Enfermero(23, "Andres", "Suarez", TipoDocumento.CC, 4567899885L);

        //Añadir 2 procedimientos al enfermero

        e.addProcedure("Vacunacion");
        e.addProcedure("Lavado de oidos");

        //procedimientos de "e"

        for( String p : e.getProcedimientos()){

                System.out.println("procedimiento: " + p);                
                
        }


    }

    
}