package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String solskin = "solskin";
        String godt = "godt";
        String dejligt = "dejligt";

        String lort = "lort";
        String ringe = "ringe";
        String regn = "regn";

        System.out.println("Hvordan er går det i dag?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.contains(lort) || answer.contains(ringe) || answer.contains(regn)){
            System.out.println("Humøret er ikke så godt i dag");}
        else if (answer.contains(solskin) || answer.contains(godt) || answer.contains(dejligt)){
            System.out.println("Humøret er godt i dag");
        }

    }
}
