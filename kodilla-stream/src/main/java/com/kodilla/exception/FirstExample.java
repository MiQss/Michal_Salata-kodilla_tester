package com.kodilla.exception;

import javax.sound.midi.Soundbank;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Willy Wonka";
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);
    }
}
