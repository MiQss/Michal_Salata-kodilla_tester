package com.kodilla.inheritance.homework;

public class Application {
    public static void main (String[] args) {
        Windows98 windows98 =new Windows98(1998);
        windows98.turnOn();

        Windows11 windows11 =new Windows11(2021);
        windows11.turnOff();
    }
}
