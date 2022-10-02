package com.kodilla.collections.interfaces.homework;

public class VW implements Car {
    private int speed;
    private int acceleration;
    private int brakes;

    public VW( int speed){
        this.speed=speed;
        this.acceleration=30;
        this.brakes=-15;
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
        return "VW{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", brakes=" + brakes +
                '}';
    }
}
