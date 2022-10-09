package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
       public static List<Flight> getFlightsTable(){
        List<Flight> flightsTable= new ArrayList<>();

        flightsTable.add(new Flight("Warsaw","New York"));
        flightsTable.add(new Flight("Warsaw","London"));
        flightsTable.add(new Flight("Warsaw","Paris"));
        flightsTable.add(new Flight("London","Berlin"));
        flightsTable.add(new Flight("London","New York"));
        return flightsTable;
    }

}
