package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main {

  public static void main(String[] args) {
    Scanner scan = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
    System.out.println("Velkommen! Du ønsker at bage Fredes Drømmekage :-)" + "\n");
    System.out.println("hvor mange mennesker ønsker du at bage til?");
    int amountOfPeople = scan.nextInt();

    // Baseret på kage til én person vil følgende opskrift blive brugt:

    double wheat = 35;
    double egg = 30;
    double vanilla = 0.06;
    double sugar = 37.5;

    // udregner nu hvor meget der skal laves til baseret på antallet af personer der er blevet indtastet.

    double calculatedWheat = wheat * amountOfPeople;
    double calculatedEgg = egg * amountOfPeople;
    double calculatedVanilla = vanilla * amountOfPeople;
    double calculatedSugar = sugar * amountOfPeople;

    int calculatedTotal = (int) (calculatedEgg + calculatedVanilla + calculatedWheat + calculatedSugar);

    // Print som angiver hvor meget mel, sukker, æg og vanilje som skal bruges til antallet af personer der er tastet ind.
    System.out.printf("For at lave Fredes Drømmekage til %s personer, skal du bruge: \n\t %5.2f g hvede \n\t %5.2f g æg\n\t%5.2f g vanilje \n\t %5.2f g sukker \n" ,amountOfPeople, calculatedWheat, calculatedEgg, calculatedVanilla, calculatedSugar);

        System.out.printf("Til %d personer, skal der bruges: gram mel, ", amountOfPeople);

  }
}