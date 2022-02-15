package com.company;

public class Main {


    public void sayHello(String firstname) {
        System.out.print("Mit navn er " + firstname);
    }

    public void presentPet(String animalType, String animalName) {
        System.out.print(", jeg har en " + animalType + " der hedder " + animalName);
    }

    public static void main(String[] args) {

        Main obj = new Main();
        obj.sayHello("Randi");
        obj.presentPet("Gnu", "Leif");
    }
}