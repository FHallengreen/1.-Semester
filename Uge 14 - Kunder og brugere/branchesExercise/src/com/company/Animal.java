package com.company;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract boolean eat(String foodType);

    public abstract String mood();

    public abstract String name();

    @Override
    public String toString() {
        return name;
    }

    public abstract String makeNoise();

}
