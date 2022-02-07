package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main {
  public Main() {
  }

  public static void main(String[] args) {
    Scanner scan = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
    System.out.println("Velkommen! Du ønsker at bage Fredes Drømmekage :-)\n");
    System.out.println("hvor mange mennesker ønsker du at bage til?");
    int amountOfPeople = scan.nextInt();


    double wheat = 35.0;
    double egg = 30.0;
    double vanilla = 0.06;
    double sugar = 37.5;


    double calculatedWheat = wheat * (double) amountOfPeople;
    double calculatedEgg = egg * (double) amountOfPeople;
    double calculatedVanilla = vanilla * (double) amountOfPeople;
    double calculatedSugar = sugar * (double) amountOfPeople;

    int calculatedTotal = (int) (calculatedEgg + calculatedVanilla + calculatedWheat + calculatedSugar);

    System.out.printf("For at lave Fredes Drømmekage til %s personer, skal du bruge: \n\t %5.2f "
            + "g hvede \n\t %5.2f g æg\n\t%5.2f g vanilje \n\t %5.2f g sukker \n",
        amountOfPeople, calculatedWheat, calculatedEgg, calculatedVanilla, calculatedSugar);

    System.out.println("\nDin kage skulle gerne veje cirka " + calculatedTotal + " gram.");

    double[] wheatKj = new double[]{335.0, 16.0, 57.0, 0.7, 2.3};
    double[] eggKj = new double[]{137.0, 12.0, 1.3, 0.0, 2.8};
    double[] vanillaKj = new double[]{195.0, 4.6, 17.0, 10.7, 5.9};
    double[] sugarKj = new double[]{400.0, 0.0, 100.0, 100.0, 0.0};

    int sumCalories = (int) DoubleStream.of(new double[]{wheatKj[0] + eggKj[0] + vanillaKj[0], sugarKj[0]}).sum();
    double sumProtein = DoubleStream.of(new double[]{wheatKj[1] + eggKj[1] + vanillaKj[1], sugarKj[1]}).sum();
    double sumCarbs = DoubleStream.of(new double[]{wheatKj[2] + eggKj[2] + vanillaKj[2], sugarKj[2]}).sum();
    double sumSugar = DoubleStream.of(new double[]{wheatKj[3] + eggKj[3] + vanillaKj[3], sugarKj[3]}).sum();
    double sumFat = DoubleStream.of(new double[]{wheatKj[4] + eggKj[4] + vanillaKj[4], sugarKj[4]}).sum();


    System.out.println("\nKagen indeholder per 100 gram: \n\t" + sumCalories + " kcal \n\t" + sumProtein + " g protein\n\t"
        + sumCarbs + " g kulhydrater \n\t" + sumSugar + " g sukker \n\t" + sumFat + " g fedt \n");


    double totalGram = (calculatedTotal / 100);

    System.out.println("Det svarer til at kage totalt har følgende macros:" + (sumCalories * totalGram)
        + " kcal \n\t" + (sumProtein * totalGram) + " g protein \n\t" + (sumCarbs * totalGram) + " g kulhydrater \n\t"
        + (sumSugar * totalGram) + " g sukker \n\t" + (sumFat * totalGram) + " g fedt \n");
  }
}