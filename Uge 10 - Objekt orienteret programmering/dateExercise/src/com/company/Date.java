package com.company;

public class Date {

  private int day;
  private int month;
  private int year;

  public boolean leapYear(){
    if (year%400 == 0) return true;
    if (year%4 == 0) return year%100 != 0;
    return false;
  }
  public void setToNextDay() {
    if (day==31 && month == 12){
      day = 1;
      month = 1;
      year++;
    }
    else if (day==31){
      day = 1;
      month++;
    }
    else if (!leapYear() && month == 2 && day == 28){
          day = 1;
          month++;
    }
    else if (leapYear() && month == 2 && day == 29){
      day = 1;
      month++;
      }
      else day++;
  }

  public void myDate (int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
    }

  public String toString() {
    return "Dato: "+ day +
        "/" + month +
        "-" + year;}
}
