package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int Tomme;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Indtast antal tommer her: ");
         Tomme = keyboard.nextInt();
         double CentimeterTilTomme = 2.54;

        System.out.println(Tomme + " Tommer svarer til " + CentimeterTilTomme * Tomme + " CM");
    }
}
