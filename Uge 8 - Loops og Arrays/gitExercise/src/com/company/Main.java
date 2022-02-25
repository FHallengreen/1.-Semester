package com.company;

import java.util.Scanner;

public class Main {

    public void greet (String name){
        System.out.println("Hej " + name);

    }

    public void askAboutAge (String age){
        System.out.println("Du er : " + age + " år gammel");
        System.out.println("Stor ged");
    }
    public static void main(String[] args) {
        System.out.println("It works... enter name: ");
        Main obj = new Main();
        Scanner scan = new Scanner(System.in);
        obj.greet(scan.nextLine());
        System.out.println("Enter your age: ");
        obj.askAboutAge(scan.nextLine());
    }
}
