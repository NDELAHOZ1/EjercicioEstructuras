package com.unisys.clases;


public class Perro {
    public String raza;

    public Perro(){
        raza="";
    }

    public Perro(String raza){
        this.raza=raza;
    }
    public String getRaza()
    {
        return this.raza;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }
}
