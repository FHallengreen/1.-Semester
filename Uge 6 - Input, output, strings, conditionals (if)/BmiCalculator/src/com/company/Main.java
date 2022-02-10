package com.company;

import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast din vægt og højde:");
        System.out.print("Din Vægt i kg ");
        double weight = sc.nextDouble();
        System.out.print("Din Højde i meter ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Dit BMI er: %.2f \n ",bmi);

        if (bmi < 18.5){
            System.out.println("Du er undervægtig, Æd noget mad!");}
        else if (bmi > 18.6 && bmi < 24.9){
            System.out.println("Du er normalvægtig");}
        else if (bmi > 24.9 && bmi < 39.9){
            System.out.println("Du er overvægtig");}
        else if (bmi > 40){
            System.out.println("Du er meget overvægtig");}
        if (bmi > 45 || bmi < 15){
            System.out.println("Dobbelt tjek om du har indtastet korrekt data!");}
    }}