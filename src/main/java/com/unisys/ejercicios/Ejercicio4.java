package com.unisys.ejercicios;

import com.unisys.coloresyemojis.Emojis;
import com.unisys.coloresyemojis.ColoresTexto;
public class Ejercicio4 {
    public static void main(String[] args) {
        String saludo="Hola";
        String saludo2="Hello";
        String saludo3="HOLA";
        Emojis emoji = new Emojis();
        ColoresTexto colores = new ColoresTexto();
        System.out.println(colores.ANSI_CYAN+colores.ANSI_BLACK_BACKGROUND+"-------EJERCICIO 4-------"+colores.ANSI_RESET);
        System.out.println(colores.ANSI_YELLOW+"saludo es: "+saludo+colores.ANSI_RESET);
        System.out.println("Longitud de saludo es: "+saludo.length());
        System.out.println("Cuarto caracter de saludo es: "+saludo.charAt(3));
        System.out.println("Posicion de \"l\" en saludo es: "+saludo.indexOf('l')+"\n");
        System.out.println("Saludo en MAYUS: "+saludo.toUpperCase()+emoji.HELLO);
        System.out.println("Saludo en minus: "+saludo.toLowerCase()+emoji.HELLO);


        if (saludo2.equals(saludo) == false){
            System.out.println("\n"+colores.ANSI_RED+saludo+" y "+saludo2+" no son iguales"+colores.ANSI_RESET);
        }

        if (saludo3.equalsIgnoreCase(saludo) == true){
            System.out.println("\n"+colores.ANSI_GREEN+saludo+" y "+saludo3+" son iguales"+colores.ANSI_RESET+emoji.PARTY);
        }

        System.out.println(emoji.FLAMENCA+emoji.SUNGLASSES);


    }
}
