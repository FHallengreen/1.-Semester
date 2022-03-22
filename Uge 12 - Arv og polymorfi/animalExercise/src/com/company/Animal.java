package com.company;

public class Animal {

private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak (){
        System.out.println("Dyret siger:");
    }

    @Override
    public String toString() {
        return "Says ";
    }
}
