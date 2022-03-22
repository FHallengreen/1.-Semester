package com.company;

public class Animal {

private String name;
private Color color;

    public Animal(String name) {
        this.name = name;
        this.color = Color.BLACK;
    }

    public Color getColor() {
        return color;
    }

    public Animal (String name, String color){
        this.name = name;
        this.color = Color.BLACK;

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
