package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle() {
        super(2, 0, 0, 3);
    }

    @Override
    public void calculateArea() {
        double area;
        area = getA()*getB();
        System.out.println("Pole prostokątu wynosi: " +area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter;
        perimeter = 2*getA()+2*getB();
        System.out.println("Obwód prostokątu wynosi: " +perimeter);
    }
}
