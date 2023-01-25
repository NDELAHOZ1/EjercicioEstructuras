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
        Pieza pieza2 = new Pieza("Bateria","Periferico");
        Pieza pieza3 = new Pieza("Intel I7","Procesador");
        Pieza pieza4 = new Pieza("RAM","Memoria");
        List<Pieza> listadoPiezas = new ArrayList<>();
        listadoPiezas.add(pieza1);
        listadoPiezas.add(pieza2);
        listadoPiezas.add(pieza3);
        listadoPiezas.add(pieza4);
        Ordenador portatil = new Ordenador("Dell","Latitude3123",listadoPiezas);
        System.out.println(ColoresTexto.ANSI_BLACK+ColoresTexto.ANSI_WHITE_BACKGROUND+"Piezas de Ordenador:"+ColoresTexto.ANSI_RESET);
        for (int numpieza=0;numpieza<listadoPiezas.size();numpieza++)
        {
            System.out.println(portatil.getPieza().get(numpieza).getNombre());
        }
        Set<Pieza> misPiezas = new HashSet<>();
        misPiezas.add(pieza1);
        misPiezas.add(pieza2);
        misPiezas.add(pieza3);
        misPiezas.add(pieza4);
        System.out.println(ColoresTexto.ANSI_BLUE+"Conjunto 4 piezas: \n"+ColoresTexto.ANSI_RESET+misPiezas);
        pieza4 = new Pieza("RAM","Memoria");
        misPiezas.add(pieza4);
        //Aunque pieza 4 es aniadida dos veces como tiene el mismo contenido no se aniade realmente al set.
        //Esto es posible porque se ha generado el equals() y el hashcode() de Pieza que es el que permite
        //que Set compare y detecte qu hay dos Piezas iguales
        System.out.println(ColoresTexto.ANSI_RED+"Conjunto 4 piezas [dos piezas con el mismo contenido]: \n"+ColoresTexto.ANSI_RESET+misPiezas);


        List<Pieza> piezasOrdenadas = new ArrayList<>(misPiezas);
        piezasOrdenadas.sort(Comparator.comparing(String::valueOf));
        System.out.println(ColoresTexto.ANSI_YELLOW+"Conjunto 4 piezas ordenadas: \n"+ColoresTexto.ANSI_RESET+piezasOrdenadas);;

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
