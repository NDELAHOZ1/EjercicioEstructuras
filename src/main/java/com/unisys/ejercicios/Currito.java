package com.unisys.ejercicios;

public class Currito extends Empleado{
    private Jefe responsable;
    private String dispositivosAsociados;

    public Currito() {
        super();
        this.responsable = new Jefe();
        this.dispositivosAsociados = "";
    }

    public Currito(String nombre, String dni, Integer tlf, String habilidades, Double sueldo, String cargo, String departamento, Integer aniosEmpresa, Jefe responsable, String dispositivosAsociados) {
        super(nombre, dni, tlf, habilidades, sueldo, cargo, departamento, aniosEmpresa);
        this.responsable = responsable;
        this.dispositivosAsociados = dispositivosAsociados;
    }

    public Jefe getResponsable() {
        return responsable;
    }

    public void setResponsable(Jefe responsable) {
        this.responsable = responsable;
    }

    public String getDispositivosAsociados() {
        return dispositivosAsociados;
    }

    public void setDispositivosAsociados(String dispositivosAsociados) {
        this.dispositivosAsociados = dispositivosAsociados;
    }
}
