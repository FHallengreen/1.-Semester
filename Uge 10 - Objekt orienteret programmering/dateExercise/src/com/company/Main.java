package com.company;

public class Main {

    public static void main(String[] args) {
	  Date today = new Date();
    today.myDate(1,1,2022);

      for (int i = 0; i < 31; i++) {
        for (int j = 0; j < 12; j++) {
          System.out.print(today.toString() + '\t');
          today.setToNextDay();
        }
        System.out.println();
      }
    }
}
