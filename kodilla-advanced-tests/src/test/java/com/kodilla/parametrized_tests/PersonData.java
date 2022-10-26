package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonData {

    private static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(2.07,55),"Very severely underweight"),
                Arguments.of(new Person(1.97,60),"Severely underweight"),
                Arguments.of(new Person(1.97,65),"Underweight"),
                Arguments.of(new Person(1.87,85),"Normal (healthy weight)"),
                Arguments.of(new Person(1.77,90),"Overweight"),
                Arguments.of(new Person(1.77,95),"Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.67,105),"Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.67,115),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.57,120),"Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.57,130),"Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.57,160),"Obese Class VI (Hyper Obese)")
        );
    }
}
