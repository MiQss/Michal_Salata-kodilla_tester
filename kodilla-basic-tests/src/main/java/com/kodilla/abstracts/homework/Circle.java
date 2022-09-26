package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    public Circle() {
        super(0, 2, 3.14, 0);
    }

    @Override
    public void calculateArea() {
        double area;
        area = getPI()*Math.pow(getR(),2);
        System.out.println("Pole koła wynosi: " +area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter;
        perimeter = 2*getPI()*getR();
        System.out.println("Obwód koła wynosi: " +perimeter);
    }
}
