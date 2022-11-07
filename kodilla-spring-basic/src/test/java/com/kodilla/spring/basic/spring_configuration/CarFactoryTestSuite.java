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
    public void shouldCreateRandomCar() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);
        //When
        String type = car.getCarType();
        System.out.println(type);
        //Then
        List<String> possibleTypes = Arrays.asList("Cabrio", "Sedan", "SUV");
        Assertions.assertTrue(possibleTypes.contains(type));
    }
    @Test
    public void shouldPutTheLightsOnInDeclaredHours(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);
        //when
        boolean result = car.hasHeadlightsTurnedOn();
        //then
        if (LocalTime.now().isAfter(LocalTime.of(20,0,0))
                && LocalTime.now().isBefore(LocalTime.of(6, 0, 0))){
            Assertions.assertTrue(result);
        } else
            Assertions.assertFalse(result);


    }
}
