package com.kodilla.abstracts.homework;

public class Kwadrat extends Shape{
    public Kwadrat() {
        super(2, 0, 0,0);
    }
    @Override
    public void obliczPole() {
        double pole;
        pole = Math.pow(getA(),2);
        System.out.println("Pole kwadratu wynosi: " +pole);
    }
    @Override
    public void obliczObwód() {
        double obwód;
        obwód = 4*getA();
        System.out.println("Obwód kwadratu wynosi: " +obwód);
    }
}
