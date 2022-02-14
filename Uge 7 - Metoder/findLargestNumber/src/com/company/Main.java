package com.company;

import java.util.Scanner;

public class Main {

    public int tal1;
    public int tal2;

    public void getUserInput(){

        System.out.println("Indtast de to tal: ");
        Scanner sc = new Scanner((System.in));
        tal1 = sc.nextInt();
        tal2 = sc.nextInt();
    }
    public void largestNumber(){
        if (tal1 > tal2){
            System.out.println("Det største tal er: " + tal1);
        }
        else System.out.println("Det største tal er: " + tal2);
    }
    public static void main(String[] args) {
    Main obj = new Main();
    obj.getUserInput();
    obj.largestNumber();
    }
}

//    public void derErFest(){
//        System.out.println("Festen kører og kaliorene er " + kcal);
//    }
