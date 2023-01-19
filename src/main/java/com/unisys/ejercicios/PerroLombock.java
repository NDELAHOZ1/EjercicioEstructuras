package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.beans.ConstructorProperties;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerroLombock {
    private String nombre;
    private String raza;
    private Date fechaNacimiento;
    private char genero;

}
