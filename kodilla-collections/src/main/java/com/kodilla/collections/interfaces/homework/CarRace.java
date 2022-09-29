package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

import java.sql.SQLOutput;

public class CarRace {
    public static void main(String[] args) {
        Skoda skoda = new Skoda(100);
        doRace(skoda);

        VW vw = new VW(100);
        doRace(vw);

        Porsche porsche = new Porsche(100);
        doRace(porsche);
    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }

}
