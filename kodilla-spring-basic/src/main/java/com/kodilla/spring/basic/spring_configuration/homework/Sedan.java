package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime localTime) {
        return localTime.isAfter(LocalTime.of(20, 0)) || localTime.isBefore(LocalTime.of(6, 0));
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
