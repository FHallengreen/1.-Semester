package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  // global variables:
  boolean tooOld;
  boolean tooYoung;

  public int minimumAge(int yourAge) {
    return (yourAge / 2) + 7;
  }

  public int maximumAge(int yourAge) {
    return (yourAge - 7) * 2;
  }

  public boolean tooYoung(int yourAge, int dateAge) {
    tooYoung = (dateAge <= minimumAge(yourAge));
    if (tooYoung) {
      return true;
    }
    return false;
  }

  public boolean tooOld(int yourAge, int dateAge) {
    tooOld = dateAge > maximumAge(yourAge);
    if (tooOld) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println("Velkommen til version 2 af dateTooYoung - som nu også viser om daten er for gammel!!");
    Scanner sc = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
    new Scanner(System.in);
    System.out.println("Indtast først din egen alder:");
    int yourAge = sc.nextInt();
    System.out.println("Indtast din dates alder:");
    int dateAge = sc.nextInt();

    Main obj = new Main();
    obj.tooYoung(yourAge, dateAge);
    obj.tooOld(yourAge, dateAge);

    if ((!obj.tooYoung) && (!obj.tooOld)) {
      System.out.println("Din date er helt fin!");
    } else if (obj.tooYoung) {
      System.out.println("Din date er for ung!");
    } else {
      System.out.println("Din date er for gammel!");
    }

  }
}