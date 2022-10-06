package com.kodilla.collections.adv.maps.complex.homework;

import java.util.Objects;

public class Principal {
    private String firstname;
    private String lastname;

    public Principal (String firstname, String lastname){
        this.firstname=firstname;
        this.lastname= lastname;
    }
    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}
