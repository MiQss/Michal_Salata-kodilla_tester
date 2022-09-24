package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int a =5;
        int b= 8;

        double sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult,0.1);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double subtractResult = calculator.subtract(a,b);
        boolean correctSub=ResultChecker.assertEquals(-3,subtractResult, 0.1);
        if (correctSub) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double squaredResult = calculator.squared(a);
        boolean correctSqu=ResultChecker.assertEquals(25, squaredResult, 0.1);
        if (correctSqu) {
            System.out.println("Metoda squared działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczby " + a);
        }
    }
}
