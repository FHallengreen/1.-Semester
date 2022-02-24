package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

  String allCards = "Ace of Heart, One of Heart, Two of Heart, Three of Heart, Four of Heart, Five of Heart, Six of Heart, Seven of Heart, Eight of Heart, Nine of Heart, Ten of Heart, Jack of Heart, Queen of Heart, King of Heart, Ace of Diamond, One of Diamond, Two of Diamond, Three of Diamond, Four of Diamond, Five of Diamond, Six of Diamond, Seven of Diamond, Eight of Diamond, Nine of Diamond, Ten of Diamond, Jack of Diamond, Queen of Diamond, King of Diamond, Ace of Clubs, One of Clubs, Two of Clubs, Three of Clubs, Four of Clubs, Five of Clubs, Six of Clubs, Seven of Clubs, Eight of Clubs, Nine of Clubs, Ten of Clubs, Jack of Clubs, Queen of Clubs, King of Clubs, Ace of Spades, One of Spades, Two of Spades, Three of Spades, Four of Spades, Five of Spades, Six of Spades, Seven of Spades, Eight of Spades, Nine of Spades, Ten of Spades, Jack of Spades, Queen of Spades, King of Spades,";

/*
  String[] suits = new String[]{"Heart,", "Diamond,", "Clubs,", "Spades,"};
  String[] numbers = new String[]{"Ace of ","One of ","Two of ","Three of ","Four of ","Five of ","Six of ","Seven of ","Eight of ","Nine of ","Ten of ","Jack of ","Queen of ","King of "};
*/

  /*  String[] suit = "Heart ,Diamond ,Clubs ,Spades ".split(",");
    String[] numbers = "A,2,3,4,5,6,7,8,9,10,J,Q,K".split(",");*/
  String deck = "";

  public void opretKort() {
    String[] suits = new String[]{"Heart,", "Diamond,", "Clubs,", "Spades,"};
    String[] numbers = new String[]{"Ace of ", "One of ", "Two of ", "Three of ", "Four of ", "Five of ", "Six of ", "Seven of ", "Eight of ", "Nine of ", "Ten of ", "Jack of ", "Queen of ", "King of "};

    for (String suitI : suits) {
      for (String numbersI : numbers) {
        deck += (numbersI + suitI + " ");
      }
    }
  }

  public void printCards() {
    opretKort();
    System.out.print(deck);
  }


/*    public void createAllCards (){
      List<String> deck = new ArrayList<String>();
        for(String s:suit)
            for(String n:numbers)
                deck.add(s + n);
    }*/

  public void replaceTwoCards(int cardA, int cardB) {
  }

  public static void main(String[] args) {

    Main obj = new Main();
//    obj.createAllCards();
    obj.printCards();
    obj.replaceTwoCards(1, 5);
  }
}
