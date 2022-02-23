package com.company;

import java.util.Random;

public class Main {

  String str = "Frederik";
  public void printOneLetter(String firstname) {

    for (int i = 0; i <= 7; i++) {
      char letter = firstname.charAt(i);
      System.out.println(letter);
    }

  }

  public void findIndexOf(String firstname, char index) {
    int findI = 0;
    for (int i = 0; i <= firstname.length(); i++) {
      findI = firstname.indexOf(index);
    }
    if (!(findI == -1)) {
      System.out.println("Fundet!");
    } else System.out.println(-1);
  }

  public void reverseString(String firstname) {
    for (int i = firstname.length() - 1; i >= 0; i--) {
      char letter = firstname.charAt(i);
      System.out.print(letter);
    }
  }

  Random random = new Random();

  public void mockify(String mockifyText) {
    for (int i = 0; i < mockifyText.length(); i++) {
      String letter = mockifyText.substring(i, i + 1);
      int mockIt = random.nextInt(0, 2);

      if (mockIt == 1) {
        letter.toUpperCase();
      } else
        letter.toLowerCase();
    }
  }

  public String mockifyb(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      boolean even = random.nextInt(100) % 2 == 0;
      String letter = str.substring(i, i + 1);
      if (even) {
        sb.append(letter.toLowerCase());
      } else {
        sb.append(letter.toUpperCase());
      }
    }
    return sb.toString();
  }

  public void starblock(int width, int height) {
    for (int x = 1; x <= height; x++) {
      for (int y = 1; y <= width; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void printMulTable(int width, int height) {
    for (int x = 1; x <= height; x++) {
      for (int y = 1; y <= width; y++) {
        System.out.printf("%5d ", x * y);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Main obj = new Main();

//        obj.printOneLetter("Frederik");
//        obj.findIndexOf("Frederik", 'i');
//        obj.reverseString("Frederik");
//        obj.mockify("du er sørme god til at kode");
//        obj.mockifyb("du er sørme god til at kode");
//        obj.starblock(5,3);
        obj.printMulTable(10,10);
  }
/*	String navn = "Frederik Hansen";
        String fornavn = "";

        for (int i=0;i<5;i++){
            char letter = navn.charAt(i);
            fornavn += letter;
        }
        System.out.println(fornavn);
    }*/
}
