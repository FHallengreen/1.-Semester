package com.company;

public class Film{
    private String movieTitel;
    private int releaseYear;
    private Producer producer;

    public Film (String movieTitel, int releaseYear){
        this.movieTitel = movieTitel;
        this.releaseYear = releaseYear;
    }

    public Film (String movieTitel){
        this.movieTitel = movieTitel;
        this.releaseYear = 2022;
    }

    public Film (String movieTitel, int releaseYear, Producer producer){
        this.movieTitel = movieTitel;
        this.releaseYear = releaseYear;
        this.producer = producer;
    }

    @Override
    public String toString() {
        if (producer == null){
          return "Film " + movieTitel + " Udgivelsesår " + releaseYear + " No producer";
        }
        else return "Film " + movieTitel + " Udgivelsesår " + releaseYear + producer;
    }
}
