package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	String [] names = {"Harry", "Ron", "Hermione"};
        ArrayList<String> people = new ArrayList<>(List.of(names));
        System.out.println(people);
        people.add("Draco");
        System.out.println(people);
        people.add("Neville");
        System.out.println(people);
        people.remove("Draco");
        System.out.println(people);
        people.add("Luna");
        System.out.println(people);
        List youThree = people.subList(0,3);
        System.out.println(youThree);
        people.add(1,"Cho");
        System.out.println(people);
        people.add(1,"Ginny");
        System.out.println(people);

        people.addAll(List.of(new String [] {"Fred", "George"}));
        System.out.println(people);

        int result = people.indexOf("Fred");
        people.remove(result);
        System.out.println(Arrays.toString(people.toArray()).replace("[", "").replace("]", ""));

    }
}
