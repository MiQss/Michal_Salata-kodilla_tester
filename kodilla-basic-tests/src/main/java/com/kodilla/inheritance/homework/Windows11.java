package com.kodilla.inheritance.homework;

public class Windows11 extends OperatingSystem{
    public Windows11 (int year){
        super(year);
    }
    @Override
    public void turnOn() {
        System.out.println("Witamy w systemie Windows11 z "+ getYear(2021));
    }@Override
    public void turnOff() {
        System.out.println("Windows 11 żegna użytkownika");
    }

}
