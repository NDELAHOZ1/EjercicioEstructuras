package com.unisys.colecciones;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ordenador implements Serializable {
    private String marca;
    private String modelo;
    private List<Pieza> pieza;

    public Ordenador() {
        this.marca = "";
        this.modelo = "";
        this.pieza = new ArrayList<>();
    }

    public Ordenador(String marca, String modelo, Pieza pieza) {
        this.marca = marca;
        this.modelo = modelo;
        this.pieza = new ArrayList<>();
        this.pieza.add(pieza);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Pieza> getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza.add(pieza);
    }
    public void removePieza(Pieza pieza) {
        this.pieza.remove(pieza);
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pieza='" + pieza + '\'' +
                '}';
    }
}
