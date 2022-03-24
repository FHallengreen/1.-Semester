package com.company;

public class premiumUser extends User{

    int discount = 10;
    public premiumUser(String username, String password, int discount) {
        super(username, password);
    }

    @Override
    public String toString() {
        return this.getUsername().toUpperCase() + " discount " + discount + " %";
    }
}
