package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class RaffleCup {
    private int amountOfDices;
    ArrayList<Integer> list;

    public RaffleCup (int   amountOfDices){
        this.amountOfDices = amountOfDices;
    }

    public int shake(){
        list = new ArrayList<Integer>();
        int total = 0;
        for (int i = 0; i < amountOfDices; i++) {
            Random num = new Random();
             int dice = num.nextInt(1,6);
             total += dice;
             list.add(dice);
        }
        return total;
    }

    public void seeNumbers(){
        System.out.println(list);
    }
}
