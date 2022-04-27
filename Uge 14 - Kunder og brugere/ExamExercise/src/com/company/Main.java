package com.company;

public class Main {

    public static void main(String[] args) {
    Tekst obj = new Tekst();
    obj.addText("Ulla");
    obj.addText("Ronni");
    obj.addText("Ulla");
        System.out.println(obj.uniqueLines());
    }

}
