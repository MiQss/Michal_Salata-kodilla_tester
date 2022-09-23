package com.kodilla.inheritance.homework;

public class Windows98 extends OperatingSystem{
    public Windows98 (int year){
        super(year);
    }
    @Override
    public void turnOn() {
        System.out.println("Witamy w systemie Windows98 z "+ getYear(1998));
    }
    @Override
    public void turnOff() {
        System.out.println("Windows 98 żegna użytkownika");
    }
}
