package com.kodilla.abstracts.homework;

public class JuniorDeveloper extends Job{
    public JuniorDeveloper() {
        super(8000, "testowanie");
    }

    @Override
    public void showResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
