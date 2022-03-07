package com.company;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("Ulla", 89);
        Client client2 = new Client("Ulla", 89);
        System.out.println(client1.name);
        System.out.println(client1.age + " år");
    }
}
