package com.company;

public class Main {
    public String capitalize (String name){
        String capital =  name.substring(0, 1).toUpperCase();
        String lowercase = name.substring(1).toLowerCase();
        return capital + lowercase;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.capitalize("cOnNiE"));
    }
}
