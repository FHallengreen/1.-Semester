package com.company;

public class Main {
  String[] langtUdeArray =
      {"Drengen",
          "Puden",
          "Fjeren",
          "Fuglen",
          "Ægget",
          "Reden",
          "Bladet",
          "Kvisten",
          "Grenen",
          "Træet",
          "Bjerget"};

  public void farAway() {
    for (int i = 0; i < langtUdeArray.length; i++) {
      String langtude = langtUdeArray[i];
      System.out.println(langtude);
    }
  }

  public void farAwayWord () {
    for (int i = 0; i < langtUdeArray.length - 1; i++) {
      String langtude = langtUdeArray[i];
      String langtUde2 = langtUdeArray[i + 1];

      if (langtude == langtUdeArray[1]) {
        System.out.println(langtude + " af " + langtUde2.toLowerCase());}
      else if (langtude == langtUdeArray[3]) {
        System.out.println(langtude + " af " + langtUde2.toLowerCase());
      } else if (langtude == langtUdeArray[4]) {
        System.out.println(langtude + " i " + langtUde2.toLowerCase());
      }
      else System.out.println(langtude + " på " + langtUde2.toLowerCase());
    }
  }
  public static void main(String[] args) {

    Main obj = new Main();
//    obj.farAway();
    obj.farAwayWord();
  }
}
