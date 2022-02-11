package com.company;

import java.util.Scanner;

public class RefactoringCodeExercise {

    public static void main(String[] args) {

        // Exercise: Refactor code to avoid redundancy
        // If you have extra time: Add a while loop (when should it stop?)

        System.out.println("How much money do you have left? ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int bet;
        if (money < 500) {
            System.out.printf("You have $ %d left - Cash is dangerously low. Bet carefully. \n", money);
        } else if (money < 1000) {
            System.out.printf("You have $ %d left - Cash is somewhat low. \n \t", money);
        } else {
            System.out.printf("You have $ %d left - Cash is in good shape. Bet liberally. \n ", money);
        }
        System.out.println("How much do you want to spend?");
        bet = scanner.nextInt();
    }
}