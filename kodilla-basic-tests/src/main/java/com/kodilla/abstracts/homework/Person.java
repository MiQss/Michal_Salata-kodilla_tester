package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Person maciej = new Person("Maciej", 24, "JuniorDeveloper");
        Person kuba = new Person("Kuba", 28, "MidDeveloper");
        Person joanna = new Person("Joanna", 30, "SeniorDeveloper");

        Job junior = new JuniorDeveloper();
        Job mid = new MidDeveloper();
        Job senior = new SeniorDeveloper();
        System.out.println(maciej.firstName + " " + maciej.job);
        if (maciej.job == "JuniorDeveloper") {
            junior.showResponsibilities();
        } else if (maciej.job == "MidDeveloper") {
            mid.showResponsibilities();
        } else if (maciej.job == "SeniorDeveloper") {
            senior.showResponsibilities();
        }

        System.out.println(kuba.firstName + " " + kuba.job);
        if (kuba.job == "JuniorDeveloper") {
            junior.showResponsibilities();
        } else if (kuba.job == "MidDeveloper") {
            mid.showResponsibilities();
        } else if (kuba.job == "SeniorDeveloper") {
            senior.showResponsibilities();
        }

        System.out.println(joanna.firstName + " " + joanna.job);
        if (joanna.job == "JuniorDeveloper") {
            junior.showResponsibilities();
        } else if (joanna.job == "MidDeveloper") {
            mid.showResponsibilities();
        } else if (joanna.job == "SeniorDeveloper") {
            senior.showResponsibilities();
        }
    }
}
