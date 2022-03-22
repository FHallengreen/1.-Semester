package com.company;

public class Dog extends Animal{

    private String speak = "Wuf";

    public Dog(String name, String color) {
        super(name, color);
    }

    public void wag(){
        System.out.println( " and wags tail ");
    }
    public void speak() {
        System.out.print(speak);
    }

}
