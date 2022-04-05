package com.company;

public class Main {

    public static void main(String[] args) {

        Dog Kim = new Dog("Kim");
        Cat cat = new Cat("Øv");
        Kim.makeNoise();
        cat.makeNoise();
        System.out.println(Kim + " " + Kim.makeNoise()) ;
        System.out.println(cat + " "+ cat.makeNoise());

        Dog dog = new Dog("Vaseline Stine");
        System.out.println(dog);


    }
}
