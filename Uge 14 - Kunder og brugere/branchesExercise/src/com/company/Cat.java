package com.company;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }


    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public String mood() {
        return null;
    }

    @Override
    public String name() {
        return "Benny";
    }

    public String makeNoise() {
        return "Miav";
    }

}
