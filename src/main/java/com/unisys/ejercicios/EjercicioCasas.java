package com.unisys.ejercicios;

import com.unisys.clases.Casa;
import com.unisys.clases.Chalet;
import com.unisys.clases.ChaletLujo;
import com.unisys.clases.Piso;
import com.unisys.coloresyemojis.ColoresTexto;
import com.unisys.coloresyemojis.Emojis;

public class EjercicioCasas {
    public static void main(String[] args) {
        Casa casaBase = new Casa();
        Casa casaBase2 = new Casa("Madrid", 120.00);
        Piso piso = new Piso("Málaga",80.00,"20",5,'D');
        Chalet chalet = new Chalet("Valencia", 150.6, 2, true);
        ChaletLujo chaletLujo = new ChaletLujo("Sevilla",200.50, 3,false,3);

        System.out.println("CaseBase1 [Sin parámetros]: "+casaBase);
        System.out.println("CaseBase2 [Con parámetros]: "+casaBase2);
        System.out.println(ColoresTexto.ANSI_YELLOW+Emojis.FLAT+" Piso: "+ColoresTexto.ANSI_RESET+piso);
        System.out.println(ColoresTexto.ANSI_GREEN+ Emojis.HOUSE+" Chalet: "+ColoresTexto.ANSI_RESET+chalet);
        System.out.println(ColoresTexto.ANSI_BLUE+ Emojis.BIGHOUSE+" Chalet de Lujo: "+ColoresTexto.ANSI_RESET+chaletLujo);
    }
}
