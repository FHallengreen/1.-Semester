package com.company;

import java.util.ArrayList;

public class Raflebæger {
  private int antalTerningerIBæger;

  public Raflebæger (int antalTerningerIBæger){
    this.antalTerningerIBæger = antalTerningerIBæger;
  }

  public int ryst (){
      antalTerningerIBæger = (int) Math.floor(Math.random() * 6);
      return antalTerningerIBæger;

    }
  }
