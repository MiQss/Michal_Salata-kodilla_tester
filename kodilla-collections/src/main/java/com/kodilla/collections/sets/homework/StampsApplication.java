package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp>stamps=new HashSet<>();
        stamps.add(new Stamp("Orzeł",1.5,true));
        stamps.add(new Stamp("Bocian",1.0,true));
        stamps.add(new Stamp("Jastrząb",2.0,false));
        stamps.add(new Stamp("Sokół",1.3,false));
        stamps.add(new Stamp("Bocian",1.0,true));
        stamps.add(new Stamp("Wróbel",1.1,false));
        stamps.add(new Stamp("Bocian",1.0,true));

        System.out.println("Ilość znaczków bez powtórek: " + stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
