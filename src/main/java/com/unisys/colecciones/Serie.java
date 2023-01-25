package com.unisys.colecciones;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Serie implements Serializable {

    private final String serialUID = "1264FG90";
    private String titulo;
    private String genero;
    private Integer anioPublicacion;
    private List<Actor> reparto;

    public Serie() {
        this.titulo = "";
        this.genero = "";
        this.anioPublicacion = 0;
        this.reparto = new ArrayList<>();
    }

    public Serie(String titulo, String genero, Integer anioPublicacion, List<Actor> reparto) {
        this.titulo = titulo;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.reparto=reparto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public List<Actor> getReparto() {
        return reparto;
    }

    public void setReparto(List<Actor> reparto) {
        this.reparto = reparto;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", reparto=" + reparto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(titulo, serie.titulo) && Objects.equals(genero, serie.genero) && Objects.equals(anioPublicacion, serie.anioPublicacion)&& Objects.equals(reparto, serie.reparto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero, anioPublicacion, reparto);
    }

}
