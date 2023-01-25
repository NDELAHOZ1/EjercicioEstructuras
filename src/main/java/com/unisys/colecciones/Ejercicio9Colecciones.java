package com.unisys.colecciones;

import com.unisys.coloresyemojis.ColoresTexto;

import java.util.*;

public class Ejercicio9Colecciones {
    public static void main(String[] args) {
        List<String> listado = new ArrayList<>();
        listado.add("Hola");
        listado.add("Adios");
        System.out.println("Primer elemento del listado:"+listado.get(0));

        int i=0;
        for (String elem : listado){
            System.out.println(ColoresTexto.ANSI_GREEN+"Elemento "+ i++ +" del listado: "+ColoresTexto.ANSI_RESET+elem);
        }

        listado.remove(listado.size()-1);

        i=0;
        for (String elem : listado){
            System.out.println(ColoresTexto.ANSI_PURPLE+"Elemento "+ i++ +" del listado: "+ColoresTexto.ANSI_RESET+elem);
        }

        Set<Integer> numeros = new HashSet<>();
        numeros.add(9);
        numeros.add(7);
        numeros.add(5);
        numeros.add(3);
        numeros.add(1);

        i=0;
        for (Integer elem : numeros){
            System.out.println(ColoresTexto.ANSI_YELLOW+"Dato "+ ++i +"/"+numeros.size()+" del conjunto: "+ColoresTexto.ANSI_RESET+elem);
        }

        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(123,"ABC");
        mapa.put(456,"DEF");
        mapa.put(789,"GHI");

        System.out.println(ColoresTexto.ANSI_BLUE+"Elemento del mapa con clave 123: "+ColoresTexto.ANSI_RESET+mapa.get(123));

        for (Integer key: mapa.keySet()){
            System.out.println(ColoresTexto.ANSI_CYAN+"Elemento del mapa con clave "+ key +": "+ColoresTexto.ANSI_RESET+mapa.get(key));
        }

        Serie serieTV = new Serie();
        Actor actorPrincipal = new Actor("Martin Garcia",10,"Accion");
        Actor actrizPrincipal = new Actor("Laura Perez", 8, "Ciencia Ficción");
        List<Actor> listadoActores = new ArrayList<>();
        listadoActores.add(actorPrincipal);
        listadoActores.add(actrizPrincipal);
        serieTV.setTitulo("Titans");
        serieTV.setGenero("Ciencia Ficcion, Accion");
        serieTV.setAnioPublicacion(2020);
        serieTV.setReparto(listadoActores);

        System.out.println(ColoresTexto.ANSI_RED+ColoresTexto.ANSI_WHITE_BACKGROUND+"Reparto:"+ColoresTexto.ANSI_RESET);
        for (Actor actor:serieTV.getReparto()){
            System.out.println(actor.getNombre());
        }


    }
}
