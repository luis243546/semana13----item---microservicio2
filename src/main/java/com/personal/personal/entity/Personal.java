package com.personal.personal.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Personal {
    private Long id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private Double horasLab;
    private String cargo;
    private String lugarTrabajo;
}
