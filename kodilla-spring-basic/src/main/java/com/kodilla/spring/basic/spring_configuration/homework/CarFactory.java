package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Configuration
public class CarFactory {
    @Bean
    public Car randomCar() {
        Season season =getRandomSeason();
        Map<Season,Car> seasonCarMap = new HashMap<>();
        seasonCarMap.put(Season.SPRING,new Sedan());
        seasonCarMap.put(Season.SUMMER,new Cabrio());
        seasonCarMap.put(Season.AUTUMN,new Sedan());
        seasonCarMap.put(Season.WINTER,new SUV());

        return seasonCarMap.get(season);
    }

    private enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }

    private Season getRandomSeason() {
        Random generator = new Random();
        int seasonsNumber = generator.nextInt(3);
        return Season.values()[seasonsNumber];
    }

}
