package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

public class Paciente {

    private int id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private Long numeroIdentificacion;
    private String correoElectronico;
    private Long celular;
    private LocalDateTime fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;


    public Paciente() {
    }


    public Paciente(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroIdentificacion,
            String correoElectronico, Long celular, LocalDateTime fechaNacimiento, Double altura, Double peso,
            TipoSangre tipoSangre, char factorRH) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }



    public String getNombres() {
        return nombres;
    }


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


    public String getCorreoElectronico() {
        return correoElectronico;
    }


    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    public Long getCelular() {
        return celular;
    }


    public void setCelular(Long celular) {
        this.celular = celular;
    }


    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public Double getAltura() {
        return altura;
    }


    public void setAltura(Double altura) {
        this.altura = altura;
    }


    public Double getPeso() {
        return peso;
    }


    public void setPeso(Double peso) {
        this.peso = peso;
    }


    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }


    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    public char getFactorRH() {
        return factorRH;
    }


    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }


    


    

    
    


    
}
