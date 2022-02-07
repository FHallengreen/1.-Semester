package com.company;

import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
        new Scanner(System.in);
        System.out.println("Lad os tjekke om daten er for ung!?");
        System.out.print("Skriv din alder: ");
        double yourAge = sc.nextDouble();
        double ageOfYourDate;
        double calculatedAge = (yourAge / 2 + 7);
        do {
            System.out.print("Indtast din dates alder: ");
            ageOfYourDate = sc.nextDouble();

            if (ageOfYourDate > yourAge) {
                System.out.println("Din date er ældre end dig");}
            else if (calculatedAge <= ageOfYourDate) {
                System.out.println("Din date er ikke for ung");}
            else System.out.println("Daten er for ung, find en anden");
        }
        while (calculatedAge > ageOfYourDate);
    }
}