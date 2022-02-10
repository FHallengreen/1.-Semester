package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main {

    public static void main(String[] args) {
        Scanner scan = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
        System.out.println("Velkommen! Du ønsker at bage Fredes Drømmekage :-)\n");
        System.out.println("hvor mange mennesker ønsker du at bage til?");
        int amountOfPeople = scan.nextInt();

        // Vores ingredienser bliver defineret. Følgende svarer til gram per enkelte person.

        double wheat = 35.0;
        double egg = 30.0;
        double vanilla = 0.06;
        double sugar = 37.5;

        // Vi regner nu sammen hvor mange gram der skal bruges af de forskellige ingredienser.

        double calculatedWheat = wheat * amountOfPeople;
        double calculatedEgg = egg * amountOfPeople;
        double calculatedVanilla = vanilla * amountOfPeople;
        double calculatedSugar = sugar * amountOfPeople;

        // total vægt regnes sammen
        int calculatedTotal = (int) (calculatedEgg + calculatedVanilla + calculatedWheat + calculatedSugar);

        // vi udskriver hvor meget der skal bruges af de enkelte ingredienser.

        System.out.printf("For at lave Fredes Drømmekage til %s personer, skal du bruge: \n\t %5.2f "
                        + "g hvede \n\t %5.2f g æg\n\t%5.2f g vanilje \n\t %5.2f g sukker \n",
                amountOfPeople, calculatedWheat, calculatedEgg, calculatedVanilla, calculatedSugar);

        //totalen udskrives

        System.out.println("\nDin kage skulle gerne veje cirka " + calculatedTotal + " gram.");

    /* Ekstra --ERNÆRINGSINDHOLD--
    // Laver et array til at definere ernæringsindholdet i følgende rækkefølge:
                            kalorier, Protein, Kulhydrater, Sukker & Fedt
    */

        //double[] wheatKj = {335.0, 16.0, 57.0, 0.7, 2.3};
        double[] eggKj = {137.0, 12.0, 1.3, 0.0, 2.8};
        double[] vanillaKj = {195.0, 4.6, 17.0, 10.7, 5.9};
        double[] sugarKj = {400.0, 0.0, 100.0, 100.0, 0.0};

        FoodSort wheatX = new FoodSort(335.0, 16.0, 57.0, 0.7, 2.3);
        FoodSort eggX = new FoodSort(335.0, 16.0, 57.0, 0.7, 2.3);

        // Alt regnes sammen (f.eks. alle kalorier under første array [0] osv.)

        double sumCalories = DoubleStream.of(wheatX.kcal + eggKj[0] + vanillaKj[0], sugarKj[0]).sum();
        double sumProtein = DoubleStream.of(wheatX.getProtein() + eggKj[1] + vanillaKj[1], sugarKj[1]).sum();
        double sumCarbs = DoubleStream.of(wheatX.getCarbs() + eggKj[2] + vanillaKj[2], sugarKj[2]).sum();
        double sumSugar = DoubleStream.of(wheatX.getSugar() + eggKj[3] + vanillaKj[3], sugarKj[3]).sum();
        double sumFat = DoubleStream.of(wheatX.getFat() + eggKj[4] + vanillaKj[4], sugarKj[4]).sum();

        System.out.println("\nKagen indeholder per 100 gram: \n\t" + sumCalories + " kcal \n\t" + sumProtein + " g protein\n\t"
                + sumCarbs + " g kulhydrater \n\t" + sumSugar + " g sukker \n\t" + sumFat + " g fedt \n");

    /* til sidst ønsker jeg at udregne det totale ernæringsindhold for hele kagen. Først tages calculatedTotal og divideres med 100,
    for at gøre det nemmere at regne totalen ud */

        int totalCalculated = (calculatedTotal / 100);
        double totalCalories = (sumCalories * totalCalculated);
        double totalProtein = (sumProtein * totalCalculated);
        double totalCarbs = (sumCarbs * totalCalculated);
        double totalSugar = (sumSugar * totalCalculated);
        double totalFat = (sumFat * totalCalculated);



        System.out.println("Det svarer til at kagen totalt har følgende ernæringsindhold: \n\t" + totalCalories
                + " kcal \n\t" + totalProtein + " g protein \n\t" + totalCarbs + " g kulhydrater \n\t"
                + totalSugar + " g sukker \n\t" + totalFat + " g fedt");
    }




}