package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.PersonData#provideDataForTestingBMI")
    public void shouldCalculateBMIWithPersonDataSource(Person person){
        System.out.println(person.getBMI());
        assertNotNull(person.getBMI());
    }
}
