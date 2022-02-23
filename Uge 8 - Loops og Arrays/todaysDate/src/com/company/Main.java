package com.company;


import java.time.LocalDate;

public class Main {


  public void todaysDate(int weekday, int date, int month, int year) {

    String[] ugedage = new String[7];
    ugedage[0] = "mandag";
    ugedage[1] = "tirsdag";
    ugedage[2] = "onsdag";
    ugedage[3] = "torsdag";
    ugedage[4] = "fredag";
    ugedage[5] = "lørdag";
    ugedage[6] = "søndag";

    String dayOfWeek = "";

    if (weekday == 1) {
      dayOfWeek = ugedage[0];
    } else if (weekday == 2) {
      dayOfWeek = ugedage[1];
    } else if (weekday == 3) {
      dayOfWeek = ugedage[2];
    } else if (weekday == 4) {
      dayOfWeek = ugedage[3];
    } else if (weekday == 5) {
      dayOfWeek = ugedage[4];
    } else if (weekday == 6) {
      dayOfWeek = ugedage[5];
    } else if (weekday == 7) {
      dayOfWeek = ugedage[6];
    }

    String[] months = new String[12];
    months[0] = "Januar";
    months[1] = "Februar";
    months[2] = "Marts";
    months[3] = "April";
    months[4] = "Maj";
    months[5] = "Juni";
    months[6] = "July";
    months[7] = "August";
    months[8] = "September";
    months[9] = "Oktober";
    months[10] = "November";
    months[11] = "December";

    String dayOfMonth = "";

    if (month == 1) {
      dayOfMonth = months[0];
    } else if (month == 2) {
      dayOfMonth = months[1];
    } else if (month == 3) {
      dayOfMonth = months[2];
    } else if (month == 4) {
      dayOfMonth = months[3];
    } else if (month == 5) {
      dayOfMonth = months[4];
    } else if (month == 6) {
      dayOfMonth = months[5];
    } else if (month == 7) {
      dayOfMonth = months[6];
    }else if (month == 8) {
      dayOfMonth = months[7];
    }else if (month == 9) {
      dayOfMonth = months[8];
    }else if (month == 10) {
      dayOfMonth = months[9];
    }else if (month == 11) {
      dayOfMonth = months[10];
    }else if (month == 12) {
      dayOfMonth = months[11];
    }


    System.out.printf("Det er i dag %s den %d %s %d", dayOfWeek, date, dayOfMonth, year);
  }

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    Main obj = new Main();
    int weekday = today.getDayOfWeek().getValue();
    int date = today.getDayOfMonth();
    int month = today.getMonthValue();
    int year = today.getYear();

    obj.todaysDate(weekday, date, month, year);
  }
}
