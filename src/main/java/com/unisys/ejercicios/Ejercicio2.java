package com.unisys.ejercicios;
import com.unisys.coloresyemojis.Emojis;
import com.unisys.coloresyemojis.ColoresTexto;

public class Ejercicio2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        int edad = 17;
        Emojis emoji = new Emojis();
        ColoresTexto color = new ColoresTexto();
        while (i <10) {
            if(i==9){
                System.out.println(color.ANSI_BLUE+"Vuelta numero " + (++i) + " del while"+color.ANSI_RESET);
            }
            else {
                System.out.println("Vuelta numero " + (++i) + " del while");
            }
        }

        do {
            if(j==9){
                System.out.println(color.ANSI_CYAN+color.ANSI_BLACK_BACKGROUND+"Vuelta numero " + (++j) + " del do-while"+color.ANSI_RESET);
            }
            else {
                System.out.println("Vuelta numero " + (++j) + " del do-while");
            }
        }while (j <10);

        if (edad < 18) {
            System.out.println(color.ANSI_RED+edad + " años. Edad no permitida para conducir"+color.ANSI_RESET);
        }

        edad++;
        System.out.println(color.ANSI_YELLOW+"Acaba de cumplir un año más!!!"+ emoji.PARTY + emoji.PARTY +color.ANSI_RESET);

        if(edad > 21){
            System.out.println(edad+" años. Puede beber en USA y conducir");
        }
        else if(edad >= 18){
            System.out.println(color.ANSI_GREEN+edad + " años. Edad permitida para conducir"+color.ANSI_RESET);
        }
        else{
             System.out.println(edad+" años.");
        }

        uno: while (k<10) {
            ++k;
            switch (k) {
                case 2 -> {
                    System.out.println(color.ANSI_PURPLE+"Valor "+ k +" asi que continue"+color.ANSI_RESET);
                    continue uno;
                }
                case 5 -> {
                    System.out.println("Valor "+k+" asi que ciao");
                    break uno;
                }
            }
        }
        System.out.println(emoji.FLAMENCA+emoji.SUNGLASSES);
    }
}
