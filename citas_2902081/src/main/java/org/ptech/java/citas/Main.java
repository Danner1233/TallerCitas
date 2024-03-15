package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.CitaEnfermero;
import org.ptech.java.citas.entities.CitaMedico;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.Usuario;
import org.ptech.java.citas.entities.Enums.Especialidad;
import org.ptech.java.citas.entities.Enums.EstadoCita;
import org.ptech.java.citas.entities.Enums.Motivo;
import org.ptech.java.citas.entities.Enums.TipoDocumento;
import org.ptech.java.citas.entities.Enums.TipoSangre;
import org.ptech.java.citas.interfaces.IAgendable;

public class Main {
    public static void main(String[] args) {


        //Medico

        Consultorio c1 = new Consultorio(12, "Carrera 7 -19", 67);
        Consultorio c2 = new Consultorio(11, "Carrera 7 -19", 23);
        Consultorio c3 = new Consultorio(13, "Carrera 7 -19", 12);

        Medico m1 = new Medico(21, "Danner", "Arias", TipoDocumento.CC, 1085046484L, 3325232L, Especialidad.ONCOLOGIA);
        Medico m2 = new Medico(20, "Suarez", "Andres", TipoDocumento.CC, 108504648L, 33252323L, Especialidad.OPTOMETRIA);

        Paciente p1 = new Paciente(1, "Danna", "Ramirez", TipoDocumento.TI, 12365478898L, "Danna@gmail.com", 3143255914L, LocalDateTime.now(), 1.84, 65.5, TipoSangre.O, '+', Motivo.GRIPE);
        Paciente p2 = new Paciente(2, "Alexix", "Ramirez", TipoDocumento.TI, 123654728898L, "Alexix@gmail.com", 31433255914L, LocalDateTime.now(), 1.84, 65.5, TipoSangre.O, '+', Motivo.ESCOPOLAMINA);
        Paciente p3 = new Paciente(4, "Andres", "Suarez", TipoDocumento.TI, 123654783898L, "Andres@gmail.com", 31243255914L, LocalDateTime.now(), 1.84, 65.5, TipoSangre.O, '+', Motivo.ESCOPOLAMINA);
        Paciente p4 = new Paciente(4, "Danner", "Arias", TipoDocumento.TI, 123654788918L, "Danner@gmail.com", 31434255914L, LocalDateTime.now(), 1.84, 65.5, TipoSangre.O, '+', Motivo.ESCOPOLAMINA);
        Paciente p5 = new Paciente(15, "Julian", "londiño", TipoDocumento.TI, 123654788398L, "Julian@gmail.com", 31423255914L, LocalDateTime.now(), 1.84, 65.5, TipoSangre.O, '+', Motivo.GRIPE);

        Enfermero e1 = new Enfermero(31, "Brayan", "Morales", TipoDocumento.CC, 1254587855L);
        Enfermero e2 = new Enfermero(32, "Brayan", "Morales", TipoDocumento.CC, 1254587855L);
        Enfermero e3 = new Enfermero(33, "Brayan", "Morales", TipoDocumento.CC, 1254587855L);

        CitaMedico cm2 = new CitaMedico(34, LocalDateTime.now(), c3, p5, m2, EstadoCita.AGENDADA);
        CitaMedico cm3 = new CitaMedico(31, LocalDateTime.now(), c2, p2, m1, EstadoCita.AGENDADA);

        CitaEnfermero ce1 = new CitaEnfermero(100, LocalDateTime.now(), c3, p5, e3, EstadoCita.CANCELADA);
        CitaEnfermero ce2 = new CitaEnfermero(100, LocalDateTime.now(), c1, p4, e1, EstadoCita.REALIZADA);



        //Registrar citas medico
        System.out.println("------------------------------------------------");

        System.out.println("Nombre Medico: " + m1.getNombres() + " " + m1.getApellidos());
        System.out.println("Nombre Paciente: " + p1.getNombres() + " " + p1.getApellidos());
        System.out.println("Fecha de la consulta: " + cm2.getFecha());
        System.out.println("Motivo de la cita: " + p1.getMotivo());
        System.out.println("Consulorio: " + c1.getNumero());
        System.out.println("Estado de la cita: " + cm2.agendarCita(LocalDateTime.now(), c3));

        System.out.println("------------------------------------------------");

        System.out.println("Nombre Medico: " + m2.getNombres() + " " + m2.getApellidos());
        System.out.println("Nombre Paciente: " + p3.getNombres() + " " + p3.getApellidos());
        System.out.println("Fecha de la consulta: " + cm3.getFecha());
        System.out.println("Motivo de la cita: " + p3.getMotivo());
        System.out.println("Consultorio: " + c2.getNumero());
        System.out.println("Estado de la cita: " + cm3.getEstado());

        System.out.println("---------------------------------------------------------------");

        //Agendar Citas enfermero

        e1.addProcedure("Lavado de Oidos");
        e2.addProcedure("vacunacion");
        e3.addProcedure("Lavado de Oidos");

        System.out.println("--------------------------------------------------------");

        System.out.println("Nombre Enfermero: " + e1.getNombres() + " " + e1.getApellidos());
        System.out.println("Nombre paciente: " + p5.getNombres() + " " + p5.getApellidos());
        System.out.println("Fecha cita: " + ce1.getFecha());
        System.out.println("Fecha cita: " + c1.getNumero());
        ce1.cancelarCita();
        System.out.println("Estado Cita: " + ce1.getEstado());
        System.out.println("Procedimiento: " + e1.getProcedimientos()   );
        


    }

    
}