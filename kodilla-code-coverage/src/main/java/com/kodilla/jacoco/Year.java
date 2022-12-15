package com.kodilla.jacoco;

public class Year {

    int leapYear;

    public Year(int leapYear) {
        this.leapYear = leapYear;
    }

    public boolean isLeap() {
        if (this.leapYear % 4 == 0) {
            if (this.leapYear % 100 == 0) {
                return this.leapYear % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
