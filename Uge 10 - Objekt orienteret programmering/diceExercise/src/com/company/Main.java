package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Dice roll = new Dice(4);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                roll.diceRoll();
                System.out.print(roll.toString() + '\t');
            }
            System.out.println();
        }
    }
}
