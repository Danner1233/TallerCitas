package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Enums.Especialidad;
import org.ptech.java.citas.entities.Enums.Motivo;
import org.ptech.java.citas.entities.Enums.TipoDocumento;
import org.ptech.java.citas.entities.Enums.TipoSangre;

public abstract class pruebaPolimorfismo {

    public static void main(String[] args) {
        // Instanciar

        Usuario u = new Usuario(12, "Danner", "Arias", TipoDocumento.TI, 321234L);

        System.out.println(u.toString());

        Medico m = new Medico(1, "Danna", "Ramirez", TipoDocumento.CC, 21212L, 1289128L, Especialidad.ONCOLOGIA);

        System.out.println(m.toString());

        Consultorio c = new Consultorio(12, "Carrera 7", 45);

        System.out.println(c.toString());

        Enfermero e = new Enfermero(13, "Andres", "Suarez", TipoDocumento.CM, 6217627627L);

        e.addProcedure("Limpieza Dental");

        System.out.println(e.toString());

        Paciente p = new Paciente(14, "Alexix", "Orostegui", TipoDocumento.TI, 7628172871L, "hsauysa@gmail.com", 1878287328L, LocalDateTime.now(), 2.45, 1.12, TipoSangre.O, '+', Motivo.GRIPE);

        System.out.println(p.toString());


    }
}
