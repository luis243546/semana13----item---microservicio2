package com.personal.personal.entity;

import java.time.LocalDate;
import java.time.Period;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {

    private Personal personal;
    private Integer cantidad;

    public int getEdad() {
        return Period.between(personal.getFechaNacimiento(), LocalDate.now()).getYears();
    }

    public Double getPagoSalario() {
        return personal.getHorasLab() * cantidad.doubleValue();
    }

}
