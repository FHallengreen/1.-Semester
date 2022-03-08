package com.company;

import java.util.Random;

public class Dice {
    private int faceValue;

    public void diceRoll(){
        Random diceRoll = new Random();
        faceValue = diceRoll.nextInt(6)+1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    @Override
    public String toString() {
        return "faceValue = " + faceValue;
    }

}
