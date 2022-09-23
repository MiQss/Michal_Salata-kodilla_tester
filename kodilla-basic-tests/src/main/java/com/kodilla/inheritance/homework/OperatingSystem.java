package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year){
        this.year = year;
    }
    public void turnOn(){
        System.out.println("Witamy w systemie z " + year + " roku.");
    }
    public void turnOff(){
        System.out.println("System się zamyka.");
    }

    public int getYear(int i) {
        return year;
    }
}
