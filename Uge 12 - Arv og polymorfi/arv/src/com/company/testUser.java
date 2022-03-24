package com.company;

import java.util.Arrays;

public class testUser {

    public testUser(String username, String password) {

    }
    public static void main(String[] args) {
	User user = new User("Per", "Goddag");
    adminUser admin = new adminUser("Bobby", "Hej123");
        System.out.println(admin.toString());
        
        premiumUser premium = new premiumUser("Ole", "Bæver122", 10);
        System.out.println(premium);
    }
}
