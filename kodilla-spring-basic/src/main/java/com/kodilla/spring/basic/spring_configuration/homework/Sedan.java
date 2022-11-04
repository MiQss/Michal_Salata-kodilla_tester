package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return LocalTime.now().isAfter(LocalTime.of(19, 59, 59))
                && LocalTime.now().isBefore(LocalTime.of(6, 0, 0));
    }
    @Override
    public String getCarType() {
        return "Sedan";
    }
}
