package com.company;

public class Main {

    public static void main(String[] args) {
        RaffleCup obj = new RaffleCup(3);
        System.out.println(obj.shake());
        obj.seeNumbers();
        System.out.println(obj.shake());
        obj.seeNumbers();
    }
}
