package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	Dice roll = new Dice();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                roll.diceRoll();
                System.out.print(roll.toString() + '\t');
                Thread.sleep(70);
            }
            System.out.println();
        }
    }
}
