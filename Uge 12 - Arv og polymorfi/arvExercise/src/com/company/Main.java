package com.company;

public class Main {

    public static void main(String[] args) {
	Customer customer = new Customer("Ole", "12345678");
    Customer customerVIP = new VIPCustomer("Randi", "42353240", 5);
        System.out.println(customer);
        System.out.println(customerVIP);
    }
}
