package com.company;

public class Main {

    public void writeCapitalized (String name){

        String Capital =  name.substring(0, 1).toUpperCase();
        String lowercase = name.substring(1).toLowerCase();

        System.out.println(Capital + lowercase);
    }
    public static void main(String[] args) {

        Main obj = new Main();
        obj.writeCapitalized("ConnIE");

        obj.writeCapitalized("CoNNIe");
        System.out.println();
    }
}
