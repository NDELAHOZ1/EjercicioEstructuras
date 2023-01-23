package com.unisys.clases;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
