package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Dice roll = new Dice();
    int [] statistic = new int[6];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                roll.diceRoll();
                int diceRoll = roll.getFaceValue();
                statistic[diceRoll -1]++;
                System.out.print(roll.toString() + '\t');

            }
            System.out.println();
        }
        System.out.println("Du slog: " + statistic[0] + ", 1'ere \n"
                + "Du slog: " + statistic[1] + ", 2'ere \n" +
                "Du slog: " + statistic[2] + ", 3'ere \n" +
                "Du slog: " + statistic[3] + ", 4'ere \n" +
                "Du slog: " + statistic[4] + ", 5'ere \n" +
                "Du slog: " + statistic[5] + ", 6'ere \n"
        );
    }
}
