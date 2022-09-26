package com.kodilla.abstracts.homework;

public abstract class Shape{
        private double PI;
        private double a;
        private double r;
        private double b;

        public Shape (double a, double r, double PI, double b){
            this.a=a;
            this.r=r;
            this.PI=PI;
            this.b=b;
        }
        public double getA(){
            return a;
        }
        public double getR(){
        return r;
        }
        public double getPI(){
        return PI;
        }
        public double getB(){
        return b;
    }
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}
