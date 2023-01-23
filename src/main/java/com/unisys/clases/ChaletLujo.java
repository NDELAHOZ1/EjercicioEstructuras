package com.unisys.clases;

import lombok.Data;

@Data
public class ChaletLujo extends Chalet{
    private Integer banios;

    public ChaletLujo() {
        super();
        this.banios = 0;
    }

    public ChaletLujo(String direccion, Double metrosCuadrados, Integer plantas, boolean adosado, Integer banios) {
        super(direccion, metrosCuadrados, plantas, adosado);
        this.banios = banios;
    }

    @Override
    public String toString() {
        return "ChaletLujo{" +
                "direccion="+getDireccion()+
                ", metrosCuadrados="+getMetrosCuadrados()+
                ", plantas=" + getPlantas() +
                ", adosado=" + isAdosado() +
                ", baños=" + banios +
                '}';
    }
}
