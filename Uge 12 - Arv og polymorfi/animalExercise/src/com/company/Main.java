package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Make animal list

        ArrayList <Animal> animals = new ArrayList<>();

        Animal animal = new Animal("animalName");
        animal.speak();
        Dog dog = new Dog("Preben");
        Cat cat = new Cat("Frans");
        animals.add(dog);
        animals.add(cat);

        animals.add(new Cat("Lonnie"));
        for (int i = 0; i < animals.size(); i++) {

            System.out.print(animals.get(i).getName() + " ");
            System.out.print(animal + "");
            animals.get(i).speak();
        }
    }
}
