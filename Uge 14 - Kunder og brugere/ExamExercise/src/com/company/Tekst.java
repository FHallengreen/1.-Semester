package com.company;

import java.util.ArrayList;

public class Tekst extends Main {
  public ArrayList <String> tekstLinjer;


  public ArrayList<String> getTekstLinjer() {
    return tekstLinjer;
  }

  public void tilføj(String tekst) throws NullPointerException{
    this.getTekstLinjer().add(tekst);
  }



  public int findAntalUnikke(){
    int unikke = tekstLinjer.size();
    System.out.println(unikke);
    return unikke;
  }

}
