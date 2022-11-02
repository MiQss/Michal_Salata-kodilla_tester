package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldAddTwoValues() {
        double result = bean.add(6.0,3.0);
        assertEquals(9.0,result);
    }
    @Test
    public void shouldSubtractTwoValues() {
        double result = bean.subtract(6.0,3.0);
        assertEquals(3.0,result);
    }
    @Test
    public void shouldMultiplyTwoValues() {
        double result = bean.multiply(6.0,3.0);
        assertEquals(18.0,result);
    }
    @Test
    public void shouldDivideTwoValues() {
        double result = bean.divide(6.0,3.0);
        assertEquals(2.0,result);
    }
}
