package com.company;

public class Main {

    public static void main(String[] args) {
        Film film1 = new Film("Tro på det", 2019, new Producer("Kim"));
        Film film2 = new Film("Der var engang");
        System.out.println(film1);
        System.out.println(film2);
    }
}
