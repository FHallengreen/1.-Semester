package com.company;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    String yesNo;

    public boolean getYNAnswer() {
        System.out.println("Type yes/no");
        sc.nextLine().toLowerCase();
        while (yesNo.equals("yes")) {
            return true;
        }
        if (yesNo.equals("no")) {
            return false;
            System.out.println("Indtast yes/no");
            return false;
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.getYNAnswer();
    }
}
