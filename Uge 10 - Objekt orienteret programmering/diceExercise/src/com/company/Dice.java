package com.company;

import java.util.Random;

public class Dice {
    private int faceValue;

    public int diceRoll(){
        Random diceRoll = new Random();
        faceValue = diceRoll.nextInt(6)+1;
        return faceValue;
    }

    public Dice(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
    @Override
    public String toString() {
        return "Dice {" +
                "faceValue = " + faceValue +
                '}';
    }
}
