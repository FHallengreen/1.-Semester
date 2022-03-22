package com.company;

public class VIPCustomer extends Customer{

    private int bonusPoint = 5;

    public VIPCustomer (String name, String phone, int bonusPoint){
        super(name,phone);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Phonenumber: " + getPhone() +
                " bonusPoint = " + bonusPoint +
                '}';
    }
}
