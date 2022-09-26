package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square() {
        super(2, 0, 0,0);
    }
    @Override
    public void calculateArea() {
        double area;
        area = Math.pow(getA(),2);
        System.out.println("Pole kwadratu wynosi: " +area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter;
        perimeter = 4*getA();
        System.out.println("Obwód kwadratu wynosi: " +perimeter);
    }
}
