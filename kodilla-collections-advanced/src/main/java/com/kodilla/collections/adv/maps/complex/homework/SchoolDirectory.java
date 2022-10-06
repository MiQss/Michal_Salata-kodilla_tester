package com.kodilla.collections.adv.maps.complex.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> directory = new HashMap<>();
        Principal maciej = new Principal("Maciej", "Nowak");
        Principal dorota = new Principal("Dorota", "Kowalska");
        Principal karol = new Principal("Karol", "Krawczyk");

        School maciejSchool = new School("Przedszkole",15,13,14,17);
        School dorotaSchool= new School("Podstawówka", 23,25,22,24,28,21);
        School karolSchool = new School ("Liceum",29,30,27,29,31,28,28,30);

        directory.put(maciej,maciejSchool);
        directory.put(dorota,dorotaSchool);
        directory.put(karol,karolSchool);

        for (Map.Entry<Principal, School> schoolDirectory : directory.entrySet()) {
            System.out.println(schoolDirectory.getKey().toString() +" jest dyrektorem w "
                    + schoolDirectory.getValue().toString());
        }
    }
}
