package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotification {

    private Map<Person, Set<Location>> personLocation = new HashMap<>();

    public void addSubscriber(Person person, Location location) {
        personLocation.computeIfAbsent(person, k -> new HashSet<>()).add(location);
    }
    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        personLocation.entrySet()
                .stream()
                .forEach(entry -> entry.getKey().receive(weatherNotification));
    }
    public void sentNotificationToLocation(WeatherNotification weatherNotification, Location location) {
        personLocation.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(location))
                .forEach(entry -> entry.getKey().receive( weatherNotification));
    }

    public void removeSubscriptionFromLocation(Person person, Location location) {
        this.personLocation.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(person))
                .forEach(entry -> entry.getValue().remove(location));
    }

    public void removeAllSubscriptions(Person person) {
        this.personLocation.entrySet()
                .removeIf(entry -> (person.equals(entry.getKey())));
    }
    public void removeLocation(Location location) {
        this.personLocation.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(location))
                .forEach(entry -> entry.getValue().remove(location));
    }
}
