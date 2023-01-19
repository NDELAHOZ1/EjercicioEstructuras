package com.unisys.ejercicios;

public class Jefe extends Empleado{
    private String numeroDespacho;

    public Jefe() {
        super();
        this.numeroDespacho = "";
    }

    public Jefe(String nombre, String dni, Integer tlf, String habilidades, Double sueldo, String cargo, String departamento, Integer aniosEmpresa, String numeroDespacho) {
        super(nombre, dni, tlf, habilidades, sueldo, cargo, departamento, aniosEmpresa);
        this.numeroDespacho = numeroDespacho;
    }

    public String getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(String numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "nombre='" + getNombre() + '\'' +
                "numeroDespacho='" + numeroDespacho + '\'' +
                '}';
    }
}
