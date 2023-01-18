package com.unisys.ejercicios;

import com.unisys.coloresyemojis.ColoresTexto;

import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.random;

public class Ejercicio3 {
    public static void main(String[] args) {
        int pos = 0;
        int [] miArray = new int [4];
        ColoresTexto coloresTexto = new ColoresTexto();

        System.out.println(coloresTexto.ANSI_BLACK_BACKGROUND+coloresTexto.ANSI_YELLOW+"-----------EJERCICIO 3---------"+coloresTexto.ANSI_RESET);

        for (pos=0; pos<miArray.length; pos++){
            miArray[pos]=(int)(random()*50);
        }
        for (pos=0; pos<miArray.length; pos++){
            System.out.println(coloresTexto.ANSI_PURPLE+"FOR -- Posicion: "+pos+" Valor: "+ miArray[pos]+coloresTexto.ANSI_RESET);
        }

        pos=0;
        while (pos<miArray.length){
            System.out.println(coloresTexto.ANSI_CYAN+"WHILE -- Posicion: "+pos+" Valor: "+ miArray[pos]+coloresTexto.ANSI_RESET);
            pos++;
        }

        pos=0;
        do{
            System.out.println(coloresTexto.ANSI_YELLOW+"DO WHILE -- Posicion: "+pos+" Valor: "+ miArray[pos]+coloresTexto.ANSI_RESET);
            pos++;
        }while(pos<miArray.length);

        float [] floatArray = new float[2000];
        for (pos=0; pos<floatArray.length; pos++){
            floatArray[pos]=0;
        }
        floatArray[2]=7.3f;
        System.out.println("floatArray[2]="+floatArray[2]);
        System.out.println("Numero de elementos en floatArray="+floatArray.length+"\n");

        int [][] intArray = new int[5][3];
        for(int i=0; i<intArray.length;i++) {
            Arrays.fill(intArray[i],i);
        }
        String[] matriz = new String[5];
        Arrays.fill(matriz,"");
        System.out.println(coloresTexto.ANSI_WHITE_BACKGROUND+coloresTexto.ANSI_BLUE+"MATRIZ DE "+intArray.length+" FILAS Y "+intArray[0].length+" COLUMNAS."+coloresTexto.ANSI_RESET);
        for (int fila=0;fila<intArray.length;fila++){
            for (int col=0;col<intArray[fila].length;col++) {
                matriz[fila] += intArray[fila][col]+" ";
            }
            System.out.println(matriz[fila]);
        }
    }
}
