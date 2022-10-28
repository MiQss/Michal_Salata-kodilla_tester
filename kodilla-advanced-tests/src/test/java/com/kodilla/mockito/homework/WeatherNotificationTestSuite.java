package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

public class WeatherNotificationTestSuite {
    WeatherNotification weatherNotification = new WeatherNotification();
    Person person = Mockito.mock(Person.class);
    Person person1 = Mockito.mock(Person.class);
    Person person2 = Mockito.mock(Person.class);
    Person person3 = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    Location location1 = Mockito.mock(Location.class);
    Set<Person> persons = new HashSet<>();
    Set<Location> locations = new HashSet<>();

    @BeforeEach
    public void prepareData() {
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        locations.add(location);
        locations.add(location1);

        for (Location location : locations) {
            weatherNotification.addSubscriber(person,location);
        }
    }

    @Test
    public void subscribedPersonShouldReceiveNotificationFromSpecifiedLocation() {
        for(Location location: locations) {
            weatherNotification.sentNotificationToLocation(weatherNotification, location);
        }
        Mockito.verify(person, Mockito.times(2)).receive(weatherNotification);
    }


    @Test
    public void shouldUnsubscribePersonFromSpecifiedLocation() {
        weatherNotification.removeSubscriptionFromLocation(person, location1);

        for(Location location: locations) {
            weatherNotification.sentNotificationToLocation(weatherNotification, location);
        }

        Mockito.verify(person, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void shouldUnsubscribePersonFromAllLocation() {
        weatherNotification.removeAllSubscriptions(person);

        for(Location location: locations) {
            weatherNotification.sentNotificationToLocation(weatherNotification, location);
        }

        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldSentNotificationOnlyToSubscribesSubscribedToLocation(){
        weatherNotification.removeSubscriptionFromLocation(person, location1);
        weatherNotification.addSubscriber(person1, location);
        weatherNotification.addSubscriber(person2, location);
        weatherNotification.addSubscriber(person3, location1);

        for(Location location: locations) {
            weatherNotification.sentNotificationToLocation(weatherNotification, location);
        }

        for(Person person: this.persons){
            Mockito.verify(person, Mockito.times(1)).receive(weatherNotification);
        }
    }
    @Test
    public void notificationShouldBeSentToAllSubscribedPerson() {
        weatherNotification.addSubscriber(person, location);
        weatherNotification.addSubscriber(person1, location1);
        weatherNotification.addSubscriber(person2, location1);
        weatherNotification.addSubscriber(person3, location);

        weatherNotification.sendNotificationToAll(weatherNotification);

        for(Person person : this.persons){
            Mockito.verify(person, Mockito.times(1)).receive(weatherNotification);
        }
    }

    @Test
    public void shouldRemoveSpecifiedLocation() {
        for (Person person : persons) {
            weatherNotification.addSubscriber(person,location);
        }

        weatherNotification.removeLocation(location);

        for(Person person : this.persons){
            Mockito.verify(person, Mockito.never()).receive(weatherNotification);
        }
    }
}

