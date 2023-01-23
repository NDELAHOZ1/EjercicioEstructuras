package com.unisys.clases;

public class Empleado extends Persona{
    protected Double sueldo;
    private String cargo;
    private String departamento;
    private Integer aniosEmpresa;

    public Empleado() {
        super();
        this.sueldo = 0.00;
        this.cargo = "";
        this.departamento = "";
        this.aniosEmpresa = 0;
    }

    public Empleado(String nombre, String dni, Integer tlf, String habilidades, Double sueldo, String cargo, String departamento, Integer aniosEmpresa) {
        super(nombre,dni,tlf,habilidades);
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.departamento = departamento;
        this.aniosEmpresa = aniosEmpresa;
    }


    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getAniosEmpresa() {
        return aniosEmpresa;
    }

    public void setAniosEmpresa(Integer aniosEmpresa) {
        this.aniosEmpresa = aniosEmpresa;
    }


}
