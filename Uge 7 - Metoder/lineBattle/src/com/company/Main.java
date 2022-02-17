package com.company;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
  // Global variables:
  int playerMovement = -10;
  int enemyMovement = 10;
  int playerSoldiers = 25;
  int enemySoldiers = 25;
  int playerFirePower = 2500;
  int enemyFirePower = 2500;
  int yourDecision;
  int diceRoll;

  Scanner in = new Scanner(System.in);

  public static void welcome() {
    System.out.println("Welcome to Frederik's Battle Line game");
    System.out.println("Make your first move, pressing one below numbers on your keyboard, to tell your soldier what to do");
    System.out.println("Move Forward: Press 1");
    System.out.println("Retreat:      Press 2");
    System.out.println("Attack!:      Press 3");
  }

  public int diceRoll() {
    Random rollTheDice = new Random();
    int diceRoll = rollTheDice.nextInt(6) + 1;
    return diceRoll;
  }

  public int enterNextMove() {
    yourDecision = in.nextInt();
    return yourDecision;
  }

  public int firstMovePlayer() {
    Random rollTheDice = new Random();
    int first = rollTheDice.nextInt(6) + 1;
    if (first == 1) {
      playerMovement = -10;
    }
    return playerMovement += first;
  }

  public int firstMoveComputer() {
    Random rollTheDice = new Random();
    int first = rollTheDice.nextInt(6) + 1;
    if (first == 1) {
      playerMovement = 10;
    }
    return playerMovement -= first;
  }

  public int calculateNextMove() {
    enterNextMove();
    int diceRoll = diceRoll();
    if (yourDecision == 1) // MOVE FORWARD
    {
      System.out.println("Du har valgt at rykke fremad. MARCH!");
      if (diceRoll == 1 || diceRoll == 3 || diceRoll == 5) {
        int move = 1;
        playerMovement += move;
        System.out.println("du slog " + diceRoll + " og du har rykket til felt: " + playerMovement);
      } else {
        int move = 2;
        playerMovement += move;
        System.out.println("du slog " + diceRoll + " og du har rykket til felt: " + playerMovement);
      }
    } else if (yourDecision == 2) // RETREAT
    {
      retreat();

    } else if (yourDecision == 3) // ATTACK
    { playerAttacks();
    }
    return calculateNextMove();
  }

  public void retreat (){
    if (playerMovement <= -10){
      if (diceRoll == 1 || diceRoll == 2) {
        int move = 1;
        playerMovement -= move;
        System.out.println("du slog " + diceRoll + " og du har rykket til felt: " + playerMovement);
      } else if ((diceRoll == 3 || diceRoll == 4)) {
        int move = 2;
        playerMovement -= move;
        int usedFirePower = 250;
        playerFirePower += usedFirePower;
        System.out.println("du slog " + diceRoll + " og du har rykket til felt: " + playerMovement + " Du har nu " + playerFirePower + " ildkraft tilbage");

      } else {
        int move = 3;
        playerMovement -= move;
        int usedFirePower = 250;
        playerFirePower += usedFirePower;
        System.out.println("du slog " + diceRoll + " og du har rykket til felt: " + playerMovement + " Du har nu " + playerFirePower + " ildkraft tilbage");
      }}
    else {
      System.out.println("Du kan ikke rykke længere tilbage, vælg noget andet..:");}

  }

  public void playerAttacks() {
    do {
      int usedFirePower = 100 * diceRoll();
      playerFirePower -= usedFirePower;
      System.out.println("Du angreb og har nu: "+ playerFirePower + " ildkraft tilbage");
      break;
    }
    while (playerFirePower > 0);

  }  {

  }



  public static void main(String[] args) {
    Main obj = new Main();
    welcome();

    System.out.println("Du starter på felt: " + obj.firstMovePlayer());
    System.out.println("Fjenden starter på felt: " + obj.firstMoveComputer());
    System.out.println(obj.calculateNextMove());

  }
}
