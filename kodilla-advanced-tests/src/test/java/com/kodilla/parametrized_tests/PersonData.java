package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonData {

    private static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(2.07,55),"Very severely underweight"),
                Arguments.of(new Person(1.87,85),"Normal (healthy weight)"),
                Arguments.of(new Person(1.57,130),"Obese Class V (Super Obese)")

        );
    }
}
