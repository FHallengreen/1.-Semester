package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    // Vi opretter en metode til at gøre det nemmere at overskue udregningen.

    public static void main(String[] args) {

        Scanner scan = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
        System.out.println("Velkommen! Du ønsker at bage Fredes Drømmekage :-)\n");
        System.out.println("hvor mange mennesker ønsker du at bage til?");
        int amountOfPeople = scan.nextInt();

        // baseret på vores ingredienser bliver defineret. Følgende opskrift er 4 personer.
        final int defaultPeople = 4;
        final double wheat = 120;
        final double egg = 2;
        final double vanilla = 0.30;
        final double sugar = 85.5;

        // Vi regner nu sammen hvor mange gram der skal bruges af de forskellige ingredienser.
        int convertedAmount = amountOfPeople / defaultPeople;
        double calculatedWheat = wheat * convertedAmount;
        double calculatedEgg = egg * convertedAmount;
        double calculatedVanilla = vanilla * convertedAmount;
        double calculatedSugar = sugar * convertedAmount;
        double calculatedEggTOGRAM = egg * 60;

        // total vægt regnes sammen
        int calculatedTotal = (int) (calculatedEggTOGRAM + calculatedVanilla + calculatedWheat + calculatedSugar);

        // vi udskriver hvor meget der skal bruges af de enkelte ingredienser.

        System.out.printf("For at lave Fredes Drømmekage til %s personer, skal du bruge: " +
                        "\nHvede: %17.0f g  \nÆg: %17.0f stks.\nVanilje: %15.2f g \nSukker: %16.0f g\n",
                amountOfPeople, calculatedWheat, calculatedEgg, calculatedVanilla, calculatedSugar);

    /* Ekstra --ERNÆRINGSINDHOLD--
                Laver en til at definere ernæringsindholdet i følgende rækkefølge:
                            kalorier, Protein, Kulhydrater, Sukker & Fedt
    */
        FoodSort foodSortWheat = new FoodSort(335.0, 16.0, 57.0, 0.7, 2.3);
        FoodSort foodSortEgg = new FoodSort(137.0, 12.0, 1.3, 0, 2.8);
        FoodSort foodSortVanilla = new FoodSort(195.0, 4.6, 17.0, 10.7, 5.9);
        FoodSort foodSortSugar = new FoodSort(400.0, 0.0, 100.0, 100.0, 0.0);

        double sumCalories = (foodSortWheat.kcal + foodSortEgg.kcal + foodSortVanilla.kcal + foodSortSugar.kcal);
        double sumProtein = (foodSortWheat.protein + foodSortEgg.protein + foodSortVanilla.protein + foodSortSugar.protein);
        double sumCarbs = (foodSortWheat.carbs + foodSortEgg.carbs + foodSortVanilla.carbs + foodSortSugar.carbs);
        double sumSugar = (foodSortWheat.sugar + foodSortEgg.sugar + foodSortVanilla.sugar + foodSortSugar.sugar);
        double sumFat = (foodSortWheat.fat + foodSortEgg.fat + foodSortVanilla.fat + foodSortSugar.fat);

    /* til sidst ønsker jeg at udregne det totale ernæringsindhold for hele kagen. Først tages calculatedTotal og divideres med 100,
    for at gøre det nemmere at regne totalen ud */

        int totalCalculated = (calculatedTotal / 100);
        double totalCalories = (sumCalories * totalCalculated);
        double totalProtein = (sumProtein * totalCalculated);
        double totalCarbs = (sumCarbs * totalCalculated);
        double totalSugar = (sumSugar * totalCalculated);
        double totalFat = (sumFat * totalCalculated);

        System.out.println("\nKagen indeholder per 100 gram: \n\t" + sumCalories + " kcal \n\t" + sumProtein + " g protein\n\t"
                + sumCarbs + " g kulhydrater \n\t" + sumSugar + " g sukker \n\t" + sumFat + " g fedt \n");

        System.out.println("Det svarer til at kagen totalt har følgende ernæringsindhold: \n\t" + totalCalories
                + " kcal \n\t" + totalProtein + " g protein \n\t" + totalCarbs + " g kulhydrater \n\t"
                + totalSugar + " g sukker \n\t" + totalFat + " g fedt");
    }
}

class FoodSort {
    public double kcal;
    public double protein;
    public double carbs;
    public double sugar;
    public double fat;

    //Constructor
    public FoodSort(double kcal, double protein, double carbs, double sugar, double fat) {
        this.kcal = kcal;
        this.protein = protein;
        this.carbs = carbs;
        this.sugar = sugar;
        this.fat = fat;
    }

}