package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
  // Global variables:
  int playerCamp = -10;
  int enemyCamp = 10;
  int playerSoldiers = 25;
  int enemySoldiers = 25;
  int playerFirePower = 2500;
  int enemyFirePower = 2500;

  Scanner in = new Scanner(System.in);

  public static void welcome(){
    System.out.println("Welcome to Frederik's Battle Line game");
    System.out.println("Make your first move, pressing one below numbers on your keyboard, to tell your soldier what to do");
    System.out.println("Move Forward: Press 1");
    System.out.println("Retreat:      Press 2");
    System.out.println("Attack!:      Press 3");
  }

  public int enterNextMove() {
    int yourDecision = in.nextInt();
    return yourDecision;
  }

  public int calculateNextMove()
  {
    if (enterNextMove() == 1) // MOVE FORWARD
    {
      System.out.println("You chose to move forward");
      Random rollTheDice = new Random();
      int diceRoll_1 = rollTheDice.nextInt(6+1-1)+1;
      System.out.println("Du slog: " +diceRoll_1);

    } else if (enterNextMove() == 2) // RETREAT
    {
      System.out.println("You chose to retreat");
      Random rollTheDice = new Random();
      int diceRoll_2 = rollTheDice.nextInt(6+1-1)+1;
      System.out.println("Du slog: " + diceRoll_2);
      }

    else if (enterNextMove() == 3) // ATTACK
    {
      System.out.println("You chose to attack");
      Random rollTheDice = new Random();
      int range = 6;
      int diceRoll_3 = rollTheDice.nextInt(range);
      System.out.println("Du slog: " + diceRoll_3);

    } else {
      System.out.println("Du valgte noget andet end 1, 2 eller 3.. prøv igen..");
    }
    return calculateNextMove();
  }

/*  public void executeOrder() {
    System.out.println(calculateNextMove());
  }*/

  public static void main(String[] args) {
    Main obj = new Main();
    welcome();
    System.out.println(obj.calculateNextMove());

  }
}
