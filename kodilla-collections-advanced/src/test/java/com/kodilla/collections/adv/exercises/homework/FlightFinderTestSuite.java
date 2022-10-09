package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom(){
        //when
        List<Flight> result= FlightFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> flightsFrom =new ArrayList<>();
        flightsFrom.add(new Flight("Warsaw","New York"));
        flightsFrom.add(new Flight("Warsaw","London"));
        flightsFrom.add(new Flight("Warsaw","Paris"));
        assertEquals(flightsFrom,result);
    }
    @Test
    public void testFindFlightsTo(){
        //when
        List<Flight> result= FlightFinder.findFlightsTo("New York");
        //then
        List<Flight> flightsTo =new ArrayList<>();
        flightsTo.add(new Flight("Warsaw","New York"));
        flightsTo.add(new Flight("London","New York"));
        assertEquals(flightsTo,result);
    }

}
