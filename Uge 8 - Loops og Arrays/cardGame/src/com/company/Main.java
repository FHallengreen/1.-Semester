package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
  String [] suits = {"Heart" , "Diamond", "Clubs", "Spades"};
  String [] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

String[] deck = new String[52];

    public void createAllCards (){
      for (int i=0; i<suits.length;i++) {
        for (int j = 0; j< numbers.length;j++) {

          int nextStep = j + (i * 13);
          deck[nextStep] = suits[i] + numbers[j];
        }
      }
    }

    public void printCards(){
//      replaceTwoCards();
//      createAllCards();
      System.out.println(Arrays.toString(deck));
    }

  public void replaceTwoCards (int card1, int card2){
    String tempKort = deck[card2];
    deck[card2] = deck[card1];
    deck[card1] = tempKort;
  }



  public void shuffleCards (){
      for (int i = 0;i < 500; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(52);
            int randomNumber2 = random.nextInt(52);
          String tempKort = deck[randomNumber];
          deck[randomNumber] = deck[randomNumber2];
          deck[randomNumber2] = tempKort;
        }
      System.out.println(Arrays.toString(deck));
  }
    public static void main(String[] args) {
	  Main obj = new Main();
   obj.createAllCards();
//    obj.printCards();
        obj.shuffleCards();
    }
}
