package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] average;
        average = new double[5];
        double sum = 0;

        for (int i = 0;i<average.length;i++){
            System.out.println("Enter next number: ");
            average[i] = input.nextDouble();
            sum= sum+= average[i];
        }
        double calculatedAverage = sum / 5;
        System.out.println("Gennemsnittet er: " + calculatedAverage);
    }
}