package com.company;

import java.util.Scanner;

public class Main {

    public void greet (String name){
        System.out.println("Hej " + name);

    }
    public static void main(String[] args) {
        System.out.println("It works... enter name: ");
        Main obj = new Main();
        Scanner scan = new Scanner(System.in);
        obj.greet(scan.nextLine());
    }
}
