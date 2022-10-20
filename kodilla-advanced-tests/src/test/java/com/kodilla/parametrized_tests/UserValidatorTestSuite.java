package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {

    private UserValidator user = new UserValidator();

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfUsernameIsEmpty(String username) {
        assertFalse(user.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource (strings = {"a", "aA", "a1",})
    public void shouldReturnFalseIfUsernameIsLessThen3Chars(String username) {
        assertFalse(user.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource (strings = {"@aaa", "1#SP", "%123",})
    public void shouldReturnFalseIfUsernameContainsForbiddenChars(String username) {
        assertFalse(user.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String email) {
        assertFalse(user.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource (strings = {"abc@gmail.c$m", "abc@gmail66.com1", "abcdef@gmail.comcomcom",})
    public void shouldReturnFalseIfDomainHasMoreThen6CharsOrForbiddenChars(String email) {
        assertFalse(user.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource (strings = {"abc#@gmail.com", "abc@gmail%.com", "abcdef@gmail,.com",})
    public void shouldReturnFalseIfEmailHasForbiddenChars(String email) {
        assertFalse(user.validateEmail(email));
    }
}
