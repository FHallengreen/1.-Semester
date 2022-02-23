package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
  String[] suit = "Heart ,Diamond ,Clubs ,Spades ".split(",");
  String[] numbers = "A,2,3,4,5,6,7,8,9,10,J,Q,K".split(",");

    public void createAllCards (){
      List<String> deck = new ArrayList<String>();
        for(String s:suit)
            for(String n:numbers)
                deck.add(s + n);
        System.out.println(deck);
    }
  public void replaceTwoCards (String card1, String card2){


  }
    public static void main(String[] args) {
	  Main obj = new Main();
    obj.createAllCards();
    }
}
