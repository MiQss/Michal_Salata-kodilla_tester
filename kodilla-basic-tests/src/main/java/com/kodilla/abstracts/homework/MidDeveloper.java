package com.kodilla.abstracts.homework;

public class MidDeveloper extends Job{
    public MidDeveloper() {
        super(18000, "nadzorowanie Juniorów");
    }

    @Override
    public void showResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
