package com.company;

import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
        System.out.println("Velkommen! Du ønsker at bage Fredes Drømmekage");
        System.out.println("hvor mange mennesker ønsker du at bage til?");
        int amountOfPeople = scan.nextInt();

        // Baseret på kage til én person vil følgende opskrift blive brugt:

        double wheat = 100;
        double egg = 61;
        double vanilla = 0.5;

        // udregner nu hvor meget der skal laves til

        System.out.printf("Til %d personer, skal der bruges: gram mel, ", amountOfPeople);

    }
}
