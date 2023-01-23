package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.ConstructorProperties;

@Data
public class Piso extends Casa{
    private String portal;
    private Integer planta;
    private char puerta;

    public Piso() {
        super();
        this.portal = "";
        this.planta = 0;
        this.puerta = ' ';
    }


    public Piso(String direccion, Double metrosCuadrados, String portal, Integer planta, char puerta) {
        super(direccion, metrosCuadrados);
        this.portal = portal;
        this.planta = planta;
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return "Chalet{" +
                "direccion="+getDireccion()+
                ", metrosCuadrados="+getMetrosCuadrados()+
                ", portal=" + portal +
                ", planta=" + planta +
                ", puerta=" + puerta +
                '}';
    }

}
