package com.company;

public class Cat extends Animal {
    private String speak = "Miaow";

    public Cat(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(speak);
    }
}
