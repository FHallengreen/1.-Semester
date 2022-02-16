package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  Scanner scan = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
  int amountOfPeople = scan.nextInt();

  //Indsæt global ratio.
  //Som bruges til at udregne "mængde"
  int totalWeightOfCake = 0;
  int eggToGram = 60; // i gram

  //Standard er altid 4, så denne kan deklareres som final.
  final int defaultPeople = 4;

  //Navn, mængde
  public int printIngredients(int howManyPeople, int amount) {
    return amount * howManyPeople;
  }

  // Vi opretter en metode til at definere opskriften og udregne opskriften.
  public void recipe(int wheat, int egg, int yeast, int sugar) {
    // Vi regner nu sammen hvor mange gram der skal bruges af de forskellige ingredienser.
    int calculatedAmount = amountOfPeople / defaultPeople;

    // totalWeightofCake += bruges til at addere vores globale totalWeight sammen.
    totalWeightOfCake += printIngredients(calculatedAmount, wheat);
    totalWeightOfCake += printIngredients(calculatedAmount, eggToGram * egg);
    totalWeightOfCake += printIngredients(calculatedAmount, yeast);
    totalWeightOfCake += printIngredients(calculatedAmount, sugar);

    System.out.printf("For at lave Fredes Teboller til %s personer, skal du bruge: " +
            "\nHvede:%22s g  \nÆg:%21s stks.\nGær:%24s g \nSukker:%21s g\n", amountOfPeople,
        printIngredients(calculatedAmount, wheat),
        printIngredients(calculatedAmount, egg),
        printIngredients(calculatedAmount, yeast),
        printIngredients(calculatedAmount, sugar));
  }


  public void printTotalWeight(String name) {
    System.out.printf("\n%s vejer:%6s g \n", name, totalWeightOfCake);

  }
    /* til sidst ønsker jeg at udregne det totale ernæringsindhold for hele kagen. Først tages totalWeightOfCake og divideres med 100,
for at gøre det nemmere at regne totalen ud */

  public void calculatedEnergy(double sumCalories, double sumProtein, double sumCarbs, double sumSugar, double sumFat) {
    int calculatedEnergy = (totalWeightOfCake / 100);
    double totalCalories = sumCalories * calculatedEnergy;
    double totalProtein = sumProtein * calculatedEnergy;
    double totalCarbs = sumCarbs * calculatedEnergy;
    double totalSugar = sumSugar * calculatedEnergy;
    double totalFat = sumFat * calculatedEnergy;

    System.out.printf("\nDet svarer til at kagen totalt har følgende ernæringsindhold:\n " +
        "Kalorier %18.2f g \nProtein: %19.2f g\nKulhydrater: %15.2f g\nSukker: %20.2f g\nFedt: %22.2f g\n", totalCalories, totalProtein, totalCarbs, totalSugar, totalFat);

  }

  public static void main(String[] args) {

    Scanner scan = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
    System.out.println("Velkommen! Du ønsker at bage Fredes Teboller :-)\n");
    System.out.println("hvor mange mennesker ønsker du at bage til?");

    // baseret på vores ingredienser bliver defineret. Følgende opskrift er 4 personer.
    Main obj = new Main();
    obj.recipe(83, 2, 5, 100);
    obj.printTotalWeight("Fredes Teboller");

    /* Ekstra --ERNÆRINGSINDHOLD--
                Laver en til at definere ernæringsindholdet i følgende rækkefølge:
                            kalorier, Protein, Kulhydrater, Sukker & Fedt
    */
    FoodSort foodSortWheat = new FoodSort(353.0, 9.6, 75.7, 0.0, 1.6);
    FoodSort foodSortEgg = new FoodSort(49.0, 10.9, 0.7, 0, 0.2);
    FoodSort foodSortYeast = new FoodSort(195.0, 4.6, 17.0, 10.7, 5.9);
    FoodSort foodSortSugar = new FoodSort(400.0, 0.0, 100.0, 100.0, 0.0);

    double sumCalories = (foodSortWheat.kcal + foodSortEgg.kcal + foodSortYeast.kcal + foodSortSugar.kcal);
    double sumProtein = (foodSortWheat.protein + foodSortEgg.protein + foodSortYeast.protein + foodSortSugar.protein);
    double sumCarbs = (foodSortWheat.carbs + foodSortEgg.carbs + foodSortYeast.carbs + foodSortSugar.carbs);
    double sumSugar = (foodSortWheat.sugar + foodSortEgg.sugar + foodSortYeast.sugar + foodSortSugar.sugar);
    double sumFat = (foodSortWheat.fat + foodSortEgg.fat + foodSortYeast.fat + foodSortSugar.fat);

    // kagen indeholder følgende per 100 g.
    System.out.printf("\nKagen indeholder per 100 gram:\n" +
            "Kalorier:%19.2f g\n" + "Protein:%20.2f g\n" + "Kulhydrater:%16.2f g\n" + "Sukker:%21.2f g\n" + "Fedt:%23.2f g\n"
        , sumCalories, sumProtein, sumCarbs, sumSugar, sumFat);

    obj.calculatedEnergy(sumCalories, sumProtein, sumCarbs, sumSugar, sumFat);
    // udregninger fortsætter i calculatedEnergy.
  }
}

// Har oprettet en class som en "opskrift" på hvad foodSort indeholder af forskellig ernæring. Kan også bruges til vores ingredienser i en senere version.
class FoodSort {
  public double kcal;
  public double protein;
  public double carbs;
  public double sugar;
  public double fat;

  //Genererer en constructor som lægger værdierne sammen i en metode. Disse variabler benyttes til i ernæringsindholdet for at opstille det hele pænere.
  public FoodSort(double kcal, double protein, double carbs, double sugar, double fat) {
    this.kcal = kcal;
    this.protein = protein;
    this.carbs = carbs;
    this.sugar = sugar;
    this.fat = fat;

  }
}