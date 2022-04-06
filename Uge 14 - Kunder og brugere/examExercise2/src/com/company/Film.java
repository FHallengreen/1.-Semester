package com.company;

import java.util.Date;

public class Film {

  private String movieTitel;
  private int releaseYear;

  public Film (String movieTitel, int releaseYear){
    this.movieTitel = movieTitel;
    this.releaseYear = releaseYear;
  }

  Date d = new Date();
  int year = d.getYear();
  public Film(String movieTitel) {
    this.movieTitel = movieTitel;
    this.releaseYear = year;
  }

  public Film() {

  }

}
