package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Dice roll = new Dice(3);
        for (int i = 0; i < 100; i++) {
            roll.diceRoll();
            System.out.println(roll.toString());
        }
    }
}
