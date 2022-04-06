package com.company;

public class Producer extends Film{

  public final String producer;

  public Producer(String movieTitel, int releaseYear, String producer) {
    super(movieTitel, releaseYear);
    this.producer = producer;
  }
}
