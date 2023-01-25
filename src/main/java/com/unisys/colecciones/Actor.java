package com.unisys.colecciones;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable {
    private final String serialUID = "5483MZ02";
    private String nombre;
    private Integer aniosExperiencia;
    private String generoFavorito;

    public Actor() {
        this.nombre = "";
        this.aniosExperiencia = 0;
        this.generoFavorito = "";
    }

    public Actor(String nombre, Integer aniosExperiencia, String generoFavorito) {
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
        this.generoFavorito = generoFavorito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getGeneroFavorito() {
        return generoFavorito;
    }

    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", generoFavorito='" + generoFavorito + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(nombre, actor.nombre) && Objects.equals(aniosExperiencia, actor.aniosExperiencia) && Objects.equals(generoFavorito, actor.generoFavorito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, aniosExperiencia, generoFavorito);
    }
}
