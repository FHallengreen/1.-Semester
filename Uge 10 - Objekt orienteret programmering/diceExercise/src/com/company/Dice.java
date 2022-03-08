package com.company;

import java.util.Random;

public class Dice {
    private int faceValue;

    public int diceRoll(){
        Random diceRoll = new Random();
        faceValue = diceRoll.nextInt(6)+1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
    @Override
    public String toString() {
        return "faceValue = " + faceValue;
    }
}
