package com.kodilla.spring.basic.spring_configuration;

import com.kodilla.spring.basic.spring_configuration.homework.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldChooseCarByTheSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);
        String carType = car.getCarType();
        List<String> carTypes = Arrays.asList("Sedan", "SUV", "Cabrio");
        Assertions.assertTrue(carTypes.contains(carType));
    }

    @Test
    public void lightsAreOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);
        boolean lights = car.hasHeadlightsTurnedOn(LocalTime.of(22,0));
        Assertions.assertTrue(lights);
    }

    @Test
    public void lightAreOff() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);
        boolean noLights = car.hasHeadlightsTurnedOn(LocalTime.of(14,0));
        Assertions.assertFalse(noLights);
    }
}
