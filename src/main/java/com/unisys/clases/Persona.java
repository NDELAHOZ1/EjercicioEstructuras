package com.unisys.clases;

public class Persona {
    private String nombre;
    private String dni;
    private Integer tlf;
    private String habilidades;

    public Persona() {
        this.nombre = "";
        this.dni = "";
        this.tlf = 0;
        this.habilidades = "";
    }

    public Persona(String nombre, String dni, Integer tlf, String habilidades) {
        this.nombre = nombre;
        this.dni = dni;
        this.tlf = tlf;
        this.habilidades = habilidades;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getTlf() {
        return tlf;
    }

    public void setTlf(Integer tlf) {
        this.tlf = tlf;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }


}
