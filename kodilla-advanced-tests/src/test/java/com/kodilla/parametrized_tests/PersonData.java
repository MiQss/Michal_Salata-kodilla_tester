package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonData {

    private static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.87,85)),
                Arguments.of(new Person(1.77,95)),
                Arguments.of(new Person(1.67,105)),
                Arguments.of(new Person(1.97,65)),
                Arguments.of(new Person(2.07,55))
        );
    }
}
