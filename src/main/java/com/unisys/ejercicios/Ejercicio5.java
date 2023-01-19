package com.unisys.ejercicios;

import com.unisys.coloresyemojis.ColoresTexto;
import com.unisys.coloresyemojis.Emojis;

import java.util.Date;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println(ColoresTexto.ANSI_YELLOW+ColoresTexto.ANSI_BLACK_BACKGROUND+"--------"+Emojis.DOG+Emojis.DOG+"EJERCICIO PERROS"+Emojis.DOG+Emojis.DOG+"----------"+ ColoresTexto.ANSI_RESET);
        String emojisPerro="";
        Perro toby = new Perro();
        System.out.println("Inicializacion objeto toby: "+toby.raza);
        toby.raza="Terrir";
        Perro otto = new Perro();
        otto.raza="Pastor Aleman";
        System.out.println("Raza de Toby: "+toby.raza);
        System.out.println("Raza de Otto: "+otto.raza);

        Perro fluky = new Perro("Pastor de aguas");
        System.out.println("Raza de Fluky: "+fluky.getRaza());
        fluky.setRaza("Dalmata");
        System.out.println("Raza de Fluky: "+fluky.getRaza());
        System.out.println("Datos de Fluky: "+fluky);

        PerroLombock mino = new PerroLombock();
        System.out.println("Datos de Mino: "+mino);

        PerroLombock piro = new PerroLombock("Piro","Golden Retriever",new Date(2020, 05, 12),'M');
        System.out.println("Datos de Piro: "+piro);
        System.out.println("Raza de Piro: "+piro.getRaza());
        System.out.println("Fecha de Nacimiento de Piro: "+piro.getFechaNacimiento());
        piro.setNombre("Piro Gomez");
        System.out.println("Nombre de Piro: "+piro.getNombre());

        for (int i=0;i<20;i++)
        {
            emojisPerro+=Emojis.DOG;
        }
        System.out.println(emojisPerro);
    }
}
