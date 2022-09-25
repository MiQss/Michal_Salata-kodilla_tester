package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape kwadrat =new Kwadrat();
        kwadrat.obliczPole();
        kwadrat.obliczObwód();

        Shape prostokat = new Prostokat();
        prostokat.obliczPole();
        prostokat.obliczObwód();

        Shape kolo=new Kolo();
        kolo.obliczPole();
        kolo.obliczObwód();
    }
}
