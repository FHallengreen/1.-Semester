package com.company;

public class Main {

    public void sayHello(String firstname){
        System.out.println("Hello " + firstname);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.sayHello("Frederik");
    }
}
