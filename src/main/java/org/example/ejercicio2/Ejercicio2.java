package org.example.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        int edad = 17;
        while (i <10) {
            System.out.println("Vuelta numero "+(++i)+" del while");
        }

        do {
            System.out.println("Vuelta numero "+(++j)+" del do-while");
        }while (j <10);

        if (edad < 18) {
            System.out.println(edad + " años. Edad no permitida para conducir");
        }

        if(edad > 21){
            System.out.println(edad+" años. Puede beber en USA y conducir");
        }
        else if(edad > 18){
            System.out.println(edad + " años. Edad permitida para conducir");
        }
        else{
             System.out.println(edad+" años.");
        }

        uno: while (k<10) {
            System.out.println("Vuelta numero "+(++k)+" del while");
            switch (k) {
                case 2 -> {
                    continue uno;
                }
                case 5 -> {
                    break uno;
                }
            }
        }
    }
}
