package com.kodilla.collections.interfaces.homework;

public class Porsche implements Car{
    private int speed;
    private int acceleration;
    private int brakes;

    public Porsche(int speed){
        this.speed=speed;
        this.acceleration=40;
        this.brakes=-20;

    }
    @Override
    public int getSpeed() {

        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed+=acceleration;;
    }

    @Override
    public void decreaseSpeed() {
        speed+=brakes;
    }
}
