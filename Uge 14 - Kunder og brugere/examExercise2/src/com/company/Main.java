package com.company;

public class Main {

    public static void main(String[] args) {
        Film film1 = new Film("Skid mig i munden", 2019, new Producer("Jøde Kim"));
        Film film2 = new Film("Der var engang");
        System.out.println(film1);
        System.out.println(film2);
    }
}
