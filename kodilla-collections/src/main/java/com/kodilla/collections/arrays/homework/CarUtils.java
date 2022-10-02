package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Porsche;
import com.kodilla.collections.interfaces.homework.VW;
import com.kodilla.collections.interfaces.homework.Skoda;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }
    private static String getCarName(Car car) {
        if (car instanceof VW)
            return "VW";
        else if (car instanceof Skoda)
            return "Skoda";
        else if (car instanceof Porsche)
            return "Porsche";
        else
            return "Unknown car name";
    }
}
