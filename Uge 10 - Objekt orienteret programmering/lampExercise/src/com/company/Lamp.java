package com.company;

public class Lamp {

    private boolean lampOnOff = false;

    public boolean switchLight() {
        if (!lampOnOff) {
            System.out.println("Du har slukket for lampen");
            return lampOnOff = true;
        }
        System.out.println("Du har tændt for lampen");
        return lampOnOff = false;
    }
}
