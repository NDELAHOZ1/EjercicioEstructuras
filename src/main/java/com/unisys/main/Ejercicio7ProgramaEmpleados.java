package com.unisys.main;

import com.unisys.ejercicios.Currito;
import com.unisys.ejercicios.Empleado;
import com.unisys.ejercicios.Jefe;

public class Ejercicio7ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Pepe", "12345678A", 987654321, "Pensamiento lógico y trabajo en equipo", 22334.40, "Currito", "Informatica", 2);

        empleado1.setNombre("Maria");
        empleado1.setDni("23456789B");
        empleado1.setTlf(12345678);
        empleado1.setHabilidades("Comunicativa y organizada");
        empleado1.setSueldo(55667.78);
        empleado1.setCargo("Directora");
        empleado1.setDepartamento("Marketing");
        empleado1.setAniosEmpresa(10);
        System.out.println("Datos empleado " + empleado1.getNombre() + "\nDNI:" + empleado1.getDni() + "\nTlf: " + empleado1.getTlf() + "\nHabilidades: " + empleado1.getHabilidades() + "\nSueldo: " + empleado1.getSueldo() + "\nCargo: " + empleado1.getCargo() + "\nDepartamento: " + empleado1.getDepartamento() + "\nAnios en la empresa: " + empleado1.getAniosEmpresa());

        Jefe jefeInformatica = new Jefe("Paco", "3456789L", 987654310, "Experto Microservicios", 58070.60, "Jefe", "Informatica", 22, "127");
        Currito curritoinformatica1 = new Currito("Raquel", "746235M", 748347868, "Ingles C2, Certificacion AWS, DevOps", 45000.00, "Arquitecta", "Informatica", 17, jefeInformatica, "Portatil 1234,Nokia0000,Cascos Jabra345");
        Currito curritoinformatica2 = new Currito("Roberto", "3241562G", 837465928, "Ingles B1, Java, SQL", 37000.00, "Developer Sr", "Informatica", 9, jefeInformatica, "Portatil 5678,Nokia0001,Cascos Jabra346");

        System.out.println("Datos Jefe " + jefeInformatica.getNombre() + "\nDNI:" + jefeInformatica.getDni() + "\nTlf: " + jefeInformatica.getTlf() + "\nHabilidades: " + jefeInformatica.getHabilidades() + "\nSueldo: " + jefeInformatica.getSueldo() + "\nCargo: " + jefeInformatica.getCargo() + "\nDepartamento: " + jefeInformatica.getDepartamento() + "\nAnios en la empresa: " + jefeInformatica.getAniosEmpresa() + "\nNumero Despacho: " + jefeInformatica.getNumeroDespacho());
        System.out.println("Datos Currito " + curritoinformatica1.getNombre() + "\nDNI:" + curritoinformatica1.getDni() + "\nTlf: " + curritoinformatica1.getTlf() + "\nHabilidades: " + curritoinformatica1.getHabilidades() + "\nSueldo: " + curritoinformatica1.getSueldo() + "\nCargo: " + curritoinformatica1.getCargo() + "\nDepartamento: " + curritoinformatica1.getDepartamento() + "\nAnios en la empresa: " + curritoinformatica1.getAniosEmpresa() + "\nJefe: " + curritoinformatica1.getResponsable() + "\nDispositivos asociados: " + curritoinformatica1.getDispositivosAsociados());
        System.out.println("Datos Currito " + curritoinformatica2.getNombre() + "\nDNI:" + curritoinformatica2.getDni() + "\nTlf: " + curritoinformatica2.getTlf() + "\nHabilidades: " + curritoinformatica2.getHabilidades() + "\nSueldo: " + curritoinformatica2.getSueldo() + "\nCargo: " + curritoinformatica2.getCargo() + "\nDepartamento: " + curritoinformatica2.getDepartamento() + "\nAnios en la empresa: " + curritoinformatica2.getAniosEmpresa() + "\nJefe: " + curritoinformatica2.getResponsable() + "\nDispositivos asociados: " + curritoinformatica2.getDispositivosAsociados());
    }
}
