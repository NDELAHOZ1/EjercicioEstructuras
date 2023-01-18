package com.unisys.ejercicios;

import com.unisys.coloresyemojis.Emojis;
import com.unisys.coloresyemojis.ColoresTexto;
public class Ejercicio4 {
    public static void main(String[] args) {
        String saludo="Hola";
        String saludo2="Hello";
        String saludo3="HOLA";
        System.out.println(ColoresTexto.ANSI_CYAN+ColoresTexto.ANSI_BLACK_BACKGROUND+"-------EJERCICIO 4-------"+ColoresTexto.ANSI_RESET);
        System.out.println(ColoresTexto.ANSI_YELLOW+"saludo es: "+saludo+ColoresTexto.ANSI_RESET);
        System.out.println("Longitud de saludo es: "+saludo.length());
        System.out.println("Cuarto caracter de saludo es: "+saludo.charAt(3));
        System.out.println("Posicion de \"l\" en saludo es: "+(saludo.indexOf('l')+1)+"\n");
        System.out.println("Saludo en MAYUS: "+saludo.toUpperCase()+Emojis.HELLO);
        System.out.println("Saludo en minus: "+saludo.toLowerCase()+Emojis.HELLO);


        if (saludo2.equals(saludo) == false){
            System.out.println("\n"+ColoresTexto.ANSI_RED+saludo+" y "+saludo2+" no son iguales"+ColoresTexto.ANSI_RESET);
        }

        if (saludo3.equalsIgnoreCase(saludo) == true){
            System.out.println("\n"+ColoresTexto.ANSI_GREEN+saludo+" y "+saludo3+" son iguales"+ColoresTexto.ANSI_RESET+Emojis.PARTY);
        }

        System.out.println(Emojis.FLAMENCA+Emojis.SUNGLASSES);


    }
}
