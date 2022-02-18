package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
  // Global variables:
  int playerPosition = -10;
  int enemyPosition = 10;
  int playerSoldiers = 25;
  int enemySoldiers = 25;
  int playerFirePower = 2500;
  int enemyFirePower = 2500;
  int yourDecision;
  int diceRoll;
  int battleDistance;

  Scanner in = new Scanner(System.in);

  public static void welcome() {
    System.out.println("Velkommen til mit Line Battle spil");
    System.out.println("For at spille skal du trykke på enten tasterne 1, 2 eller 3.\n\n");
    System.out.println("For at bevæge dig fremad:        Tryk 1");
    System.out.println("For at trække dig tilbage:       Tryk 2");
    System.out.println("For at angribe:                  Tryk 3\n");
  }

  public int diceRoll() {
    Random rollTheDice = new Random();
    diceRoll = rollTheDice.nextInt(6) + 1;
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
      playerPosition = -10;
    }
    return playerPosition += first;
  }

  public int firstMoveComputer() {
    Random rollTheDice = new Random();
    int first = rollTheDice.nextInt(6) + 1;
    if (first == 1) {
      enemyPosition = 10;
    }
    return enemyPosition -= first;
  }

  public int calculateNextMove() {
    enterNextMove();
    if (yourDecision == 1) // MOVE FORWARD
    {
      moveForward();

    } else if (yourDecision == 2) // RETREAT
    {
      retreat();

    } else if (yourDecision == 3) // ATTACK
    {
      playerAttacks();
    }
    calculateDistance();
    enemy();
    calculateDistance();
    scout();
    System.out.printf("STATUS: \nDu har: %s soldater i live og %s ildkraft tilbage.\nTraf næste beslutning..\n", playerSoldiers, playerFirePower);
    endGame();
    return calculateNextMove();
  }

  public int calculateDistance() {
    if (playerPosition <= -1 && enemyPosition >= 1) {
      battleDistance = enemyPosition - playerPosition;
    } else if (playerPosition >= 1 && enemyPosition >= 1) {
      battleDistance = enemyPosition - playerPosition;
    } else if (playerPosition >= 1 && enemyPosition <= -1) {
      battleDistance = playerPosition - enemyPosition;
    } else {
      battleDistance = playerPosition + enemyPosition;
    }

    return battleDistance;
  }

  public void moveForward() {
    System.out.println("Du har valgt at rykke fremad. MARCH!");
    diceRoll();
    if (diceRoll == 1 || diceRoll == 3 || diceRoll == 5) {
      int move = 1;
      playerPosition += move;
      System.out.println("Du slog " + diceRoll + ", rykker dermed ét felt frem og du har rykket til felt: " + playerPosition);
    } else {
      int move = 2;
      playerPosition += move;
      System.out.println("Du slog " + diceRoll + " og du har rykket to felter frem til felt: " + playerPosition);
    }

  }

  public void retreat() {
    diceRoll();
    if (playerPosition >= -10) {
      if (diceRoll == 1 || diceRoll == 2) {
        int move = 1;
        playerPosition -= move;
        System.out.println("du slog " + diceRoll + " og du har rykket til felt: " + playerPosition + " Du har nu " + playerFirePower + " ildkraft tilbage");
      } else if ((diceRoll == 3 || diceRoll == 4)) {
        int move = 2;
        playerPosition -= move;
        int usedFirePower = 250;
        playerFirePower += usedFirePower;
        System.out.println("du slog " + diceRoll + " og du har rykket til felt: " + playerPosition + " Du har nu " + playerFirePower + " ildkraft tilbage");

      } else if (diceRoll == 5 || diceRoll == 6) {
        int move = 3;
        playerPosition -= move;
        int usedFirePower = 250;
        playerFirePower += usedFirePower;
        System.out.println("du slog " + diceRoll + " og du har rykket til felt: " + playerPosition + " Du har nu " + playerFirePower + " ildkraft tilbage");
      }
    } else {
      System.out.println("Du kan ikke rykke længere tilbage, vælg noget andet..:");
    }

  }

  public void playerAttacks() {
    diceRoll();
    do {
      int usedFirePower = 100 * diceRoll();
      playerFirePower -= usedFirePower;
      System.out.println("Du angreb og har nu: " + playerFirePower + " ildkraft tilbage"); // FJERN

      if (battleDistance == 0) {
        int hit_6 = 6;
        enemySoldiers -= hit_6;
        System.out.println("HIT!");
      } else if (battleDistance == 1) {
        int hit_5 = 5;
        enemySoldiers -= hit_5;
        System.out.println("HIT!");
      } else if (battleDistance == 2) {
        int hit_4 = 4;
        enemySoldiers -= hit_4;
        System.out.println("HIT!");
      } else if (battleDistance == 3) {
        int hit_3 = 3;
        enemySoldiers -= hit_3;
        System.out.println("HIT!");
      } else if (battleDistance == 4) {
        int hit_2 = 2;
        enemySoldiers -= hit_2;
        System.out.println("HIT!");
      } else if (battleDistance == 5) {
        int hit_1 = 1;
        enemySoldiers -= hit_1;
        System.out.println("HIT");
      } else System.out.println("MISS!");
      break;
    }
    while (playerFirePower >= 0);
    if (playerFirePower <= 0){
      System.out.println("Du har ikke mere ildkraft tilbage. Ryk enten frem eller tilbage.");
    }
  }

  public void scout() {
    if (battleDistance >= 0 && battleDistance <= 2) {
      System.out.println("Fjenden er " + battleDistance + " felter væk");
    } else if (battleDistance <= 0 && battleDistance >= -3) {
      System.out.println("Fjenden er " + battleDistance + " felter væk");
    } else System.out.print("");
  }

  public int enemyDiceRoll() {
    Random rollTheDice = new Random();
    diceRoll = rollTheDice.nextInt(3) + 1;
    return diceRoll;
  }

  public void enemy() {
    enemyDiceRoll();
    if (diceRoll == 1) // MOVE FORWARD
    {
      diceRoll();
      if (diceRoll == 1 || diceRoll == 3 || diceRoll == 5) {
        int move = 1;
        enemyPosition -= move;
      } else {
        int move = 2;
        enemyPosition -= move;
      }

    } else if (diceRoll == 2) // RETREAT
    {
      diceRoll();
      if (enemyPosition >= 10) {
        if (diceRoll == 1 || diceRoll == 2) {
          int move = 1;
          enemyPosition += move;
        } else if ((diceRoll == 3 || diceRoll == 4)) {
          int move = 2;
          enemyPosition += move;
          int usedFirePower = 250;
          enemyFirePower += usedFirePower;

        } else if (diceRoll == 5 || diceRoll == 6) {
          int move = 3;
          enemyPosition += move;
          int usedFirePower = 250;
          enemyFirePower += usedFirePower;
        }
      } else {
        System.out.print("");
      }

    } else if (diceRoll == 3) // ATTACK
    {
      diceRoll();
      do {
        int usedFirePower = 100 * diceRoll();
        enemyFirePower -= usedFirePower;

        if (battleDistance == 0) {
          int hit_6 = 6;
          playerSoldiers -= hit_6;
          System.out.println("Fjenden ramte dig");
        } else if (battleDistance == 1) {
          int hit_5 = 5;
          playerSoldiers -= hit_5;
          System.out.println("Fjenden ramte dig");
        } else if (battleDistance == 2) {
          int hit_4 = 4;
          playerSoldiers -= hit_4;
          System.out.println("Fjenden ramte dig");
        } else if (battleDistance == 3) {
          int hit_3 = 3;
          playerSoldiers -= hit_3;
          System.out.println("Fjenden ramte dig");
        } else if (battleDistance == 4) {
          int hit_2 = 2;
          playerSoldiers -= hit_2;
          System.out.println("Fjenden ramte dig");
        } else if (battleDistance == 5) {
          int hit_1 = 1;
          playerSoldiers -= hit_1;
          System.out.println("Fjenden ramte dig");
        } else System.out.print("");
        break;
      }
      while (enemyFirePower >= 0);
    }
  }

  public void endGame() {
    if (playerPosition >= 10 || enemySoldiers <= 0) {
      System.out.println("__________________________________________________________________________");
      System.out.println("---------------------DU HAR VUNDET!! FLOT SEJR----------------------------");
      System.out.println("---------------------Du har " + playerSoldiers + " soldater tilbage---------------------------");
      System.out.println("--------------------Du har " + playerFirePower + " ildkraft tilbage--------------------------");
      System.out.println("__________________________________________________________________________");
    } else if (enemyPosition <= -10 || playerSoldiers <= 0) {
      System.out.println("__________________________________________________________________________");
      System.out.println("--------------------------DU HAR TABT!!-----------------------------------");
      System.out.println("----------------Fjenden har " + enemySoldiers + " soldater tilbage---------------------------");
      System.out.println("---------------Fjenden har " + enemyFirePower + " ildkraft tilbage------------------------------");
      System.out.println("__________________________________________________________________________");

    }
  }

  public static void main(String[] args) {
    Main obj = new Main();
    welcome();
    System.out.println("Du starter på felt:             " + obj.firstMovePlayer());
    System.out.println("Fjenden starter på felt:         " + obj.firstMoveComputer());
    System.out.println("Giv dine soldater deres første kommando:");
    obj.calculateDistance();
    System.out.println(obj.calculateNextMove());

  }
}