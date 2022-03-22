package com.company;

public class Cat extends Animal {
    private String speak = "Miaow";

    public Cat(String name) {
        super(name);
    }

    public void throwUp(){
        System.out.println( " and throws up ");
    }

    public void speak() {
        System.out.print(speak);
    }
}
