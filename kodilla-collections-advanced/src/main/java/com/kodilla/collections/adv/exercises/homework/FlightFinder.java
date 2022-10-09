package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(String departure) {
        List<Flight> departureTable = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)){
                departureTable.add(flight);
            }
        }
        return departureTable;
    }
    public static List<Flight> findFlightsTo(String arrival){
        List<Flight>arrivalTable=new ArrayList<>();
        for(Flight flight: FlightRepository.getFlightsTable()){
            if (flight.getArrival().equals(arrival)){
                arrivalTable.add(flight);
            }
        }
        return arrivalTable;
    }
}
