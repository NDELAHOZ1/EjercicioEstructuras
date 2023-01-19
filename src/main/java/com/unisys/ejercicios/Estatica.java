package com.unisys.ejercicios;

import lombok.Data;

@Data
public class Estatica {
    protected static double PI = 3.141516;
    private static String quejido = "Jo oooo";
    public static void berrinche (){
        System.out.println(quejido);
    }
}
