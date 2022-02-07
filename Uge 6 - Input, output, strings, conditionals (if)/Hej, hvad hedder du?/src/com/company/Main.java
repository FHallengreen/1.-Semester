package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
        System.out.println("Hej med dig, hvad hedder du?");

        String yourName = scan.nextLine();  // String hvor navnet skal indtastes
        System.out.println("Goddag " + yourName + " Hvor gammel er du?");

        // int hvor alderen indtastes
        int yourAge = scan.nextInt();

        // For at undgå scanner-bug indsættes næste input her. Ellers vil den skippe ja/nej steppet
        scan.nextLine();
        int yourBirthYear = 2022 - yourAge;
        System.out.println("Okay, så du må være født i år " + yourBirthYear);

        System.out.println("Såå går det godt " + yourName + "? (ja/nej)");
        yourName = scan.nextLine().toLowerCase(); // scanner der gør alt til lowercase

        // hvis brugeren indtaster ja, vil følgende besked blive printet
        if (yourName.equals("ja")) {
            System.out.println("Det var godt at høre!");

        // ellers hvis brugeren indtaster nej, vil følgende besked blive printet
        } else if (yourName.equals("nej")) {
            System.out.println("Det var godt at høre!");

        // hvis alt andet bliver indtastet, vil den lave fejl
        } else System.out.println("Du har ikke indtastet ja eller nej, din bøv");
    }
}