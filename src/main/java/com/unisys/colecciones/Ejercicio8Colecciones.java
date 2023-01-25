package com.unisys.colecciones;

import com.unisys.coloresyemojis.ColoresTexto;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio8Colecciones {

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    public static String cadenaAleatoria(int longitud) {
        // El banco de caracteres
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        // La cadena en donde iremos agregando un carácter aleatorio
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }
    public static void main(String[] args) {
        Pieza pieza1 = new Pieza("SSD","Memoria");
        Ordenador portatil = new Ordenador("Dell","Latitude3123",pieza1);
        //System.out.println(portatil.getPieza().getNombre());

        Pieza pieza2 = new Pieza("Bateria","Periferico");
        Pieza pieza3 = new Pieza("Intel I7","Procesador");
        Pieza pieza4 = new Pieza("RAM","Memoria");
        Pieza pieza5 = new Pieza();
        Set<Pieza> misPiezas = new HashSet<>();
        misPiezas.add(pieza1);
        misPiezas.add(pieza2);
        misPiezas.add(pieza3);
        misPiezas.add(pieza4);
        System.out.println(ColoresTexto.ANSI_BLUE+"conjunto 4 piezas: \n"+ColoresTexto.ANSI_RESET+misPiezas);
        pieza5=pieza4;
        pieza4 = new Pieza("RAM","Memoria");
        misPiezas.add(pieza4);
        System.out.println(ColoresTexto.ANSI_RED+"conjunto 4 piezas[dos instancias pieza4 anadida]: \n"+ColoresTexto.ANSI_RESET+misPiezas);


        List<Pieza> piezasOrdenadas = new ArrayList<>(misPiezas);
        piezasOrdenadas.sort(Comparator.comparing(String::valueOf));
        System.out.println(ColoresTexto.ANSI_YELLOW+"Conjunto 4 piezas ordenadas: \n"+ColoresTexto.ANSI_RESET+piezasOrdenadas);;

        /*TreeSet<Pieza> sortSet = new TreeSet<Pieza>(piezasOrdenadas);
        System.out.println(ColoresTexto.ANSI_PURPLE+"TreeSet 4 piezas: \n"+ColoresTexto.ANSI_RESET+sortSet);*/

        Map<String,Cliente> mapa = new HashMap<>();
        for (int i=0;i<10;i++){
            mapa.put(""+((int)(Math.random()*100)+1)+i,new Cliente(cadenaAleatoria(3),"C/"+cadenaAleatoria(5),""+((int)(Math.random()*999999999)+1),cadenaAleatoria(3)+"@"+cadenaAleatoria(4)+"."+cadenaAleatoria(3)));
        }
        System.out.println(ColoresTexto.ANSI_GREEN + "Visualizar el mapa:"+ColoresTexto.ANSI_RESET);
        for (String key : mapa.keySet()) {
            System.out.println(ColoresTexto.ANSI_GREEN + "CLAVE:" + ColoresTexto.ANSI_BLACK_BACKGROUND+key+ColoresTexto.ANSI_RESET + "\n"+ mapa.get(key));
        }
    }
}
