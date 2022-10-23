package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    private final GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/randomInvalidNumbers.csv")
    public void shouldThrowExceptionWithInvalidNumbers(String numbers) {
        String[] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        Set<Integer> expectedParsed = expectedSet
                .stream()
                .map(Integer::parseInt).collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> GamblingMachine.validateNumbers(expectedParsed));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/randomValidateNumbers.csv")
    public void shouldPassWithValidateNumbers(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        Set<Integer> expectedParsed = expectedSet
                .stream()
                .map(Integer::parseInt).collect(Collectors.toSet());
        GamblingMachine.validateNumbers(expectedParsed);
        assertEquals(6,expectedParsed.size());
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/randomValidateNumbers.csv")
    public void shouldCountWinsWithValidateNumbers(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        Set<Integer> expectedParsed = expectedSet
                .stream()
                .map(Integer::parseInt).collect(Collectors.toSet());
        gamblingMachine.howManyWins(expectedParsed);
    }

}
