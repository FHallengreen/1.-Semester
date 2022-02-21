package com.company;

import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);
  String yesNo;

    public boolean getYNAnswer(String yesNo) {
        yesNo = sc.nextLine().toLowerCase();
        if (yesNo == "no"){
            return false;
        }
        while (!(yesNo.equals("yes")) && (!(yesNo.equals("no")))){
            System.out.println("PLEASE type yes or no");
            return getYNAnswer(yesNo);
        }
        return false;
    }

  public boolean getnextYNAnswer() {

    do {
      yesNo = sc.nextLine().toLowerCase();
      if (yesNo.equals("no")) {
        return false;
      }
    else if (yesNo.equals("yes")){
      return true;
    }
      }
    while (!(yesNo.equals("yes")) && (!(yesNo.equals("no"))));
      return getnextYNAnswer();
  }

  public static void main(String[] args) {
    Main obj = new Main();
    System.out.println("Enter yes or no");
    obj.getnextYNAnswer();
  }
}
