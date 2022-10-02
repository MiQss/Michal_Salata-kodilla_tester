package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Porsche;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.VW;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];;
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        int drawnCarKind = RANDOM.nextInt(3);
        int speed = getRandomSpeed();
        if (drawnCarKind == 0)
            return new VW(speed);
        else if (drawnCarKind == 1)
            return new Skoda(speed);
        else {
            return new Porsche(speed);
        }
    }
    private static int getRandomSpeed() {
        return RANDOM.nextInt(250);
    }
}
