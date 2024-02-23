package org.ptech.java.citas.entities;

public class Medico {

    //Los atributos de una clase siempre tienen que ser privados
    private int id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private Long numeroIdentificacion;
    private Long registroMedico;
    private Especialidad especialidad;


    public Medico() {
    }


    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion,
            Long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    //Getters y Setters deben ser publicos
    //Firma de un Getter
    //Tipo de retorno
    //Nombre del metodo siempre emoieza oir get seguido del nombre y la primera letra va en MAYUSCULA
    // retorna: valor del atributo
    //parametro: nada
    public String getNombres() {
        return this.nombres;
    }

    //setter sirve para asignar un valor a un atriburo privado
    // tipo de dato de retorno es el void
    //nombre empieza con set seguido del nombre y el inicio del nombre va en MAYUSCULA
    //Retorna: nada
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }


    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    


    

    
}
