package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle() {
        super(2, 0, 0, 3);
    }

    @Override
    public void obliczPole() {
        double pole;
        pole = getA()*getB();
        System.out.println("Pole prostokątu wynosi: " +pole);
    }

    @Override
    public void obliczObwód() {
        double obwód;
        obwód = 2*getA()+2*getB();
        System.out.println("Obwód prostokątu wynosi: " +obwód);
    }
}
