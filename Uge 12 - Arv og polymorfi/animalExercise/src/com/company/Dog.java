package com.company;

public class Dog extends Animal{

    private String speak = "Wuf";

    public Dog(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(speak);
    }

}
