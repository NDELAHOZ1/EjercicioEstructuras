package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Chalet extends Casa{
    private Integer plantas;
    private boolean adosado;

    public Chalet(){
        super();
        this.plantas=0;
        this.adosado=false;
    }

    public Chalet(String direccion, Double metrosCuadrados, Integer plantas, boolean adosado){
        super(direccion,metrosCuadrados);
        this.plantas=plantas;
        this.adosado=adosado;
    }

    @Override
    public String toString() {
        return "Chalet{" +
                "direccion="+getDireccion()+
                ", metrosCuadrados="+getMetrosCuadrados()+
                ", plantas=" + plantas +
                ", adosado=" + adosado +
                '}';
    }

    public boolean isAdosado() {
        return adosado;
    }

    public void setAdosado(boolean adosado) {
        this.adosado = adosado;
    }
}
