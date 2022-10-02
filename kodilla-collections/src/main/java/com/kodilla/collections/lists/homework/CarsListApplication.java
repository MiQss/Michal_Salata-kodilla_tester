package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Porsche;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.VW;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars=new ArrayList<>();
        cars.add(new Skoda(180));
        cars.add(new VW(100));
        cars.add(new Porsche(100));
        VW vw = new VW(50);
        cars.add(vw);

        cars.remove(0);
        cars.remove(vw);


        System.out.println("Rozmiar kolekcji: "+ cars.size());
        for (Car car:cars){
            CarUtils.describeCar(car);
        }

    }
}
