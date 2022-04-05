package com.company;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String name();

    @Override
    public String toString() {
        return name;
    }

    public abstract String makeNoise();

}
