package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square =new Square();
        square.obliczPole();
        square.obliczObwód();

        Shape rectangle = new Rectangle();
        rectangle.obliczPole();
        rectangle.obliczObwód();

        Shape circle=new Circle();
        circle.obliczPole();
        circle.obliczObwód();
    }
}
