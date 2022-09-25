package com.kodilla.abstracts.homework;

public class SeniorDeveloper extends Job{
    public SeniorDeveloper() {
        super(22000, "nadzorowanie Juniorów i Midów");
    }

    @Override
    public void showResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
