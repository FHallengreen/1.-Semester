package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  Scanner scan = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
  int amountOfPeople = scan.nextInt();

  //Indsæt global ratio.
  //Som bruges til at udregne "mængde"
  int totalWeightOfCake = 0;
  int eggToGram = 60;
  int totalCalories = 0;

  //Standard er altid 4, så denne kan deklareres som final.
  final int defaultPeople = 4;

  //Navn, mængde
  public int printIngredients(int howManyPeople, int amount){
    return amount * howManyPeople;
  }

  // Vi opretter en metode til at definere opskriften og udregne opskriften.
  public void recipe( int wheat, int egg, int vanilla, int sugar) {
    // Vi regner nu sammen hvor mange gram der skal bruges af de forskellige ingredienser.
    int calculatedAmount = amountOfPeople / defaultPeople;

 // totalWeightofCake += bruges til at addere vores globale totalWeight sammen.
    totalWeightOfCake +=  printIngredients(calculatedAmount, wheat);
    totalWeightOfCake +=  printIngredients(calculatedAmount,eggToGram*egg);
    totalWeightOfCake +=  printIngredients(calculatedAmount, vanilla);
    totalWeightOfCake +=  printIngredients(calculatedAmount, sugar);

    System.out.printf("For at lave Fredes Drømmekage til %s personer, skal du bruge: " +
            "\nHvede:%22s g  \nÆg:%21s stks.\nVanilje:%20s g \nSukker:%21s g\n", amountOfPeople,
        printIngredients(calculatedAmount,wheat),
        printIngredients(calculatedAmount,egg),
        printIngredients(calculatedAmount,vanilla),
        printIngredients(calculatedAmount,sugar));
  }


  public void printTotalWeight(String name){
    System.out.printf("\n%s vejer:%4s g \n" ,name, totalWeightOfCake);

  }

  public void calculatedEnergy(double sumCalories,double sumProtein,double sumCarbs,double sumSugar,double sumFat){
    int calculatedEnergy = (totalWeightOfCake / 100);
    double totalCalories = sumCalories * calculatedEnergy;
    double totalProtein = sumProtein * calculatedEnergy;
    double totalCarbs = sumCarbs * calculatedEnergy;
    double totalSugar = sumSugar * calculatedEnergy;
    double totalFat = sumFat * calculatedEnergy;

    System.out.printf("\nDet svarer til at kagen totalt har følgende ernæringsindhold:\n " +
        "Kalorier %18.2f g \nProtein: %19.2f g\nKulhydrater: %15.2f g\nSukker: %20.2f g\nFedt: %22.2f g\n",totalCalories, totalProtein, totalCarbs, totalSugar, totalFat);

  }
  public static void main(String[] args) {

    Scanner scan = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
    System.out.println("Velkommen! Du ønsker at bage Fredes Drømmekage :-)\n");
    System.out.println("hvor mange mennesker ønsker du at bage til?");

    // baseret på vores ingredienser bliver defineret. Følgende opskrift er 4 personer.
    Main obj = new Main();
    obj.recipe( 330, 2, 5, 135);
    obj.printTotalWeight("Fredes Drømmekage");

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

    // kagen indeholder følgende per 100 g.
    System.out.printf("\nKagen indeholder per 100 gram:\n" +
        "Kalorier:%19.2f g\n"+ "Protein:%20.2f g\n"+"Kulhydrater:%16.2f g\n"+"Sukker:%21.2f g\n" + "Fedt:%23.2f g\n"
        ,sumCalories,sumProtein,sumCarbs,sumSugar,sumFat);

        /* til sidst ønsker jeg at udregne det totale ernæringsindhold for hele kagen. Først tages calculatedTotal og divideres med 100,
    for at gøre det nemmere at regne totalen ud */

    obj.calculatedEnergy(sumCalories,sumProtein,sumCarbs,sumSugar,sumFat);
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