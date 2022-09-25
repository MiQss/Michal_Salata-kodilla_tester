package com.kodilla.abstracts.homework;

public class Kolo extends Shape{
    public Kolo() {
        super(0, 2, 3.14, 0);
    }

    @Override
    public void obliczPole() {
        double pole;
        pole = getPI()*Math.pow(getR(),2);
        System.out.println("Pole koła wynosi: " +pole);
    }

    @Override
    public void obliczObwód() {
        double obwód;
        obwód = 2*getPI()*getR();
        System.out.println("Obwód koła wynosi: " +obwód);
    }
}
