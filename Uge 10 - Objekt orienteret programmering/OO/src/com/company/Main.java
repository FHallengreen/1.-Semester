package com.company;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("Berta", 95);
        Client client2 = new Client("Ulla", 89);
        System.out.println(client1.getName());
        client2.setAge(client2.getAge()+1);
        System.out.println(client2.getAge() + " år");
    }
}
