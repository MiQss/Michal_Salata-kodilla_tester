package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car{
     private int speed;
     private int acceleration;
     private int brakes;


    public Skoda( int speed){
        this.speed=speed;
        this.acceleration=25;
        this.brakes=-10;
    }

    @Override
    public int getSpeed() {
        return  speed;
    }

    @Override
    public void increaseSpeed() {
        speed+=acceleration;
    }


    @Override
    public void decreaseSpeed() {
        speed+=brakes;
    }

    @Override
    public String toString() {
        return "Skoda{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", brakes=" + brakes +
                '}';
    }
}
