package com.unisys.main;

import com.unisys.coloresyemojis.ColoresTexto;
import com.unisys.ejercicios.Currito;
import com.unisys.ejercicios.Empleado;
import com.unisys.ejercicios.Jefe;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio7ProgramaEmpleados {
    public static void main(String[] args) {
        Map<Integer, String> map = crearDiccionarioColores();
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
        imprimirInfoEmpleado(map,empleado1);
        imprimirInfoEmpleado(map,empleado2);

        Jefe jefeInformatica = new Jefe("Paco", "3456789L", 987654310, "Experto Microservicios", 58070.60, "Jefe", "Informatica", 22, "127");
        Currito curritoinformatica1 = new Currito("Raquel", "746235M", 748347868, "Ingles C2, Certificacion AWS, DevOps", 45000.00, "Arquitecta", "Informatica", 17, jefeInformatica, "Portatil 1234,Nokia0000,Cascos Jabra345");
        Currito curritoinformatica2 = new Currito("Roberto", "3241562G", 837465928, "Ingles B1, Java, SQL", 37000.00, "Developer Sr", "Informatica", 9, jefeInformatica, "Portatil 5678,Nokia0001,Cascos Jabra346");

        imprimirDatosJefe(map, jefeInformatica);
        imprimirDatosCurrito(map,curritoinformatica1);
        imprimirDatosCurrito(map,curritoinformatica2);
    }

    private static void imprimirDatosJefe(Map<Integer, String> map, Jefe jefeInformatica) {
        System.out.println(map.get((int)(Math.random()*10)+1)+"Datos Jefe " + jefeInformatica.getNombre() + "\nDNI:" + jefeInformatica.getDni() + "\nTlf: " + jefeInformatica.getTlf() + "\nHabilidades: " + jefeInformatica.getHabilidades() + "\nSueldo: " + jefeInformatica.getSueldo() + "\nCargo: " + jefeInformatica.getCargo() + "\nDepartamento: " + jefeInformatica.getDepartamento() + "\nAnios en la empresa: " + jefeInformatica.getAniosEmpresa() + "\nNumero Despacho: " + jefeInformatica.getNumeroDespacho()+ map.get(0));
    }


    private static void imprimirDatosCurrito(Map<Integer, String> map,Currito currito) {

        System.out.println(map.get((int)(Math.random()*10)+1)+"Datos Currito: " + currito.getNombre() + "\nDNI:" + currito.getDni() + "\nTlf: " + currito.getTlf() + "\nHabilidades: " + currito.getHabilidades() + "\nSueldo: " + currito.getSueldo() + "\nCargo: " + currito.getCargo() + "\nDepartamento: " + currito.getDepartamento() + "\nAnios en la empresa: " + currito.getAniosEmpresa() + "\nJefe: " + currito.getResponsable() + "\nDispositivos asociados: " + currito.getDispositivosAsociados()+map.get(0));
    }

    public static void imprimirInfoEmpleado(Map<Integer, String> map,Empleado empleado){
        System.out.println(map.get((int)(Math.random()*15)+1)+"Datos empleado " + empleado.getNombre() + "\nDNI:" + empleado.getDni() + "\nTlf: " + empleado.getTlf() + "\nHabilidades: " + empleado.getHabilidades() + "\nSueldo: " + empleado.getSueldo() + "\nCargo: " + empleado.getCargo() + "\nDepartamento: " + empleado.getDepartamento() + "\nAnios en la empresa: " + empleado.getAniosEmpresa()+map.get(0));
    }

    private static Map<Integer, String> crearDiccionarioColores() {
        Map<Integer, String > map = new HashMap<Integer, String>();
        map.put(0,ColoresTexto.ANSI_RESET);
        map.put(1,ColoresTexto.ANSI_YELLOW);
        map.put(2,ColoresTexto.ANSI_BLUE);
        map.put(3,ColoresTexto.ANSI_BLACK);
        map.put(4,ColoresTexto.ANSI_CYAN);
        map.put(5,ColoresTexto.ANSI_GREEN);
        map.put(6,ColoresTexto.ANSI_PURPLE);
        map.put(7,ColoresTexto.ANSI_RED);
        map.put(8,ColoresTexto.ANSI_WHITE);
        map.put(9,ColoresTexto.ANSI_YELLOW_BACKGROUND);
        map.put(10,ColoresTexto.ANSI_BLUE_BACKGROUND);
        map.put(11,ColoresTexto.ANSI_BLACK_BACKGROUND);
        map.put(12,ColoresTexto.ANSI_CYAN_BACKGROUND);
        map.put(13,ColoresTexto.ANSI_GREEN_BACKGROUND);
        map.put(14,ColoresTexto.ANSI_PURPLE_BACKGROUND);
        map.put(15,ColoresTexto.ANSI_RED_BACKGROUND);
        map.put(16,ColoresTexto.ANSI_WHITE_BACKGROUND);
        return map;
    }

}
