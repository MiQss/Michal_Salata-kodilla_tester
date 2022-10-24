package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.PersonData#provideDataForTestingBMI")
    public void shouldCalculateBMIWithPersonDataSource(Person person){
        System.out.println(person.getBMI());
        Stream<String> expected = Stream.of(
                "Very severely underweight",
                "Severely underweight",
                "Underweight",
                "Normal (healthy weight)",
                "Overweight",
                "Obese Class I (Moderately obese)",
                "Obese Class II (Severely obese)",
                "Obese Class III (Very severely obese)",
                "Obese Class IV (Morbidly Obese)",
                "Obese Class V (Super Obese)",
                "Obese Class VI (Hyper Obese)"
        );
        boolean match = expected.anyMatch(un -> un.equals(person.getBMI()));
        assertTrue(match);
    }
}
