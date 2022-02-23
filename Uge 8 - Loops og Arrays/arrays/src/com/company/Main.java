package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double [] activity; // erklæret, men har ingen værdi.
        activity = new double [4]; // opretter et nyt (tomt) array med plads til 4 doubles.

        activity[0] = -128;      // sæt positionen til noget
        activity[1] = -75;      // sæt positionen til noget
        activity[2] = -21.75;   // sæt positionen til noget
        activity[3] = 1200;     // sæt positionen til noget

        System.out.println(Arrays.toString(activity)); // udskriv det fyldte array

        double total = 0;
        for(int i=0;i<activity.length;i++){ // loop igennem hele arrayet
            total += activity[i];
        }
        System.out.println("Total saldo: " + total);

        /*
        Oprette/erklære et array ved at skrive [] efter datatypen - f.eks int[].
        Lave et nyt/tomt array ved at skrive new datatype [størrelse] - f.eks int[5]
        Tilgå et element i arrayet ved at skrive variabelnavn [index] - f.eks. liste [4]
        Få længden af et array ved at skrive variabelnavn.length - f.eks liste.length

         */

        String[] ugedage = new String[7];
        ugedage[0] = "Mandag";
        ugedage[1] = "Tirsdag";
        ugedage[2] = "Onsdag";
        ugedage[3] = "Torsdag";
        ugedage[4] = "Fredag";
        ugedage[5] = "Lørdag";
        ugedage[6] = "Søndag";

        System.out.println(Arrays.toString(ugedage));

        String[] farver = {"rød", "blå", "gul", "grøn", "orange", "turkis"};
        System.out.println(Arrays.toString(farver));

        farver[2] ="pink";

        System.out.println(Arrays.toString(farver));

        for(int i=0;i< farver.length;i++){
            String farve = farver[i];
            System.out.println(farve);
        }

    }
}
