package com.unisys.ejercicios;

public class Ejercicio1 {
    int numero;
    short marianico;
    long gasol;
    boolean independencia;
    double presupuesto;
    float longitud;
    public Ejercicio1(int num, short mari, long gas, boolean indep, double presu, float longit)
    {
        numero=num;
        marianico=mari;
        gasol=gas;
        independencia=indep;
        presupuesto=presu;
        longitud=longit;
    }
    public long suma ()
    {
        return gasol+marianico;
    }
    public static void main(String[] args) {
            System.out.println("Hello world!");
            Ejercicio1 objetoEjercicio1 = new Ejercicio1(10,(short)-1,1234567,true,12.34,56.78f);
            System.out.printf("Suma=%d",objetoEjercicio1.suma());
        }
}


