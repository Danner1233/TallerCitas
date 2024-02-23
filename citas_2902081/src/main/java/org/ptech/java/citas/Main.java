package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Especialidad;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.TipoDocumento;
import org.ptech.java.citas.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {
        
        //crear objeto
        //instanciar

        //una manera de dar valor a atributos privados emn una clase es atravez del contructor parametrizado
        Medico m = new Medico(1, "Danner", "Arias", TipoDocumento.TI, 1085046484L, 12345677L, Especialidad.OPTOMETRIA);
        
                                    

        //Se utiliza primero el setter del atributo asignado
        Medico m2 = new Medico();

        m2.setNombres("Alexix");
        m2.setApellidos("Orostegui");
        m2.setTipoDocumento(TipoDocumento.TI);
        m2.setNumeroIdentificacion(1016952406L);

        System.out.println("Nombre: " + m2.getNombres()+ " | " + "Apellido: " + m2.getApellidos() + " | " + "TipoDocumento" + m2.getTipoDocumento() + " | " + "Numero de Documento" + m2.getNumeroIdentificacion());

        //Paciente

        Paciente p1 = new Paciente(1 , "Carlos Antonio" , "Velez" ,TipoDocumento.CM , 234324324L , "cbo@misena.edu.co" , 234234L ,LocalDateTime.now() , 12.3, 186.3 ,  TipoSangre.B , '-');

        Paciente p2 = new Paciente();

        p2.setNombres("Danna");
        p2.setApellidos("Ramirez");
        p2.setTipoDocumento(TipoDocumento.TI);
        p2.setNumeroIdentificacion(125545L);
        p2.setCorreoElectronico("d@gmail.com");
        p2.setCelular(12254L);
        p2.setFechaNacimiento(LocalDateTime.now());
        p2.setAltura(1.66);
        p2.setPeso(50.1);
        p2.setTipoSangre(TipoSangre.O);
        p2.setFactorRH('+');

        System.out.println("Nombre: " + p2.getNombres() + " | " + "Apellido: " + p2.getApellidos() + " | " + "Tipo de Documento: " + p2.getTipoDocumento() + " | " + 
        "Numero de Documento: " + p2.getNumeroIdentificacion() + " | " + "Correo: " + p2.getCorreoElectronico() + " | " + "Celular" + p2.getCelular() + " | " + "Fecha de nacimiento: " + p2.getFechaNacimiento()
         + " | " + "Altura" + p2.getAltura() + " | " + "Peso" + p2.getPeso() + " | " + "Tipo de Sangre: " + p2.getTipoSangre() + p2.getFactorRH());


    }
}