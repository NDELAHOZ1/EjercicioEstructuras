package com.unisys.ejercicios;

import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.random;

public class Ejercicio3 {
    public static void main(String[] args) {
        int pos = 0;
        int [] miArray = new int [4];

        for (pos=0; pos<miArray.length; pos++){
            miArray[pos]=(int)(random()*50);
        }
        for (pos=0; pos<miArray.length; pos++){
            System.out.println("FOR -- Posicion: "+pos+" Valor: "+ miArray[pos]);
        }

        pos=0;
        while (pos<miArray.length){
            System.out.println("WHILE -- Posicion: "+pos+" Valor: "+ miArray[pos]);
            pos++;
        }

        pos=0;
        do{
            System.out.println("DO WHILE -- Posicion: "+pos+" Valor: "+ miArray[pos]);
            pos++;
        }while(pos<miArray.length);

        float [] floatArray = new float[2000];
        for (pos=0; pos<floatArray.length; pos++){
            floatArray[pos]=0;
        }
        floatArray[2]=7.3f;
        System.out.println("floatArray[2]="+floatArray[2]);
        System.out.println("Numero de elementos en floatArray="+floatArray.length);

        int [][] intArray = new int[5][3];
        for(int i=0; i<intArray.length;i++) {
            Arrays.fill(intArray[i],i);
        }
        String[] matriz = new String[5];
        Arrays.fill(matriz,"");
        for (int fila=0;fila<intArray.length;fila++){
            for (int col=0;col<intArray[fila].length;col++) {
                matriz[fila] += intArray[fila][col]+" ";
            }
            System.out.println(matriz[fila]);
        }
    }
}
