package org.ptech.java.citas.entities;

import java.util.List;
import java.util.ArrayList;

import org.ptech.java.citas.entities.Enums.TipoDocumento;

public class Enfermero extends Usuario {

    private List<String> procedimientos;

    

    @Override
    public String toString() {
        return "Enfermero: "+ this.nombres + " " + this.apellidos + ", procedimientos: " + procedimientos;
    }

    public Enfermero(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion) {

        super(id, nombres, apellidos, tipoDocumento, numeroIdentificacion);

        this.procedimientos = new ArrayList<>();

    }

public void addProcedure(String procedure){

    this.procedimientos.add(procedure);

}

public List<String> getProcedimientos() {
    return procedimientos;
}

public void setProcedimientos(List<String> procedimientos) {
    this.procedimientos = procedimientos;
}



}
