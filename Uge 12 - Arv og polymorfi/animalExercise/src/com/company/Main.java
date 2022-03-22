package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Make animal list

        ArrayList<Animal> animals = new ArrayList<>();

        Animal animal = new Animal("animalName");
        animal.speak();
        Dog dog = new Dog("Preben");
        Cat cat = new Cat("Frans");
        animals.add(dog);
        animals.add(cat);

        animals.add(new Cat("Lonnie"));

        Animal tmp;
        for (int i = 0; i < animals.size(); i++) {
            tmp = animals.get(i);
            System.out.print(tmp.getName() + " ");
            System.out.print(animal + "");
            tmp.speak(); // polymorfi
            if (tmp instanceof Dog) {
                ((Dog) tmp).wag(); //
            }
            else if (tmp instanceof Cat){
                ((Cat) tmp).throwUp();
            }
        }
    }
}
