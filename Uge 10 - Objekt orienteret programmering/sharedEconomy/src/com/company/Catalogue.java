package com.company;

import java.util.Arrays;

public class Catalogue {

  private Item[] items;
  private int count;

  public Catalogue(int itemsSize) {
    this.items = new Item[itemsSize];
  }

  public void addItem(Item item) {
    items[count] = item;
    count++;
  }


  public Item[] getFullList() {
    return items;
  }

  public Item[] getAvailableItems() {
    Item[] availableItems = new Item[items.length];
    for (int i = 0; i < this.items.length; i++) {
      Item temp = items[i];
      if (temp != null) {
        availableItems[i] = temp;
      }
    }
    return availableItems;
  }

  public Item findItem (String search){
    for (int i = 0; i < items.length; i++) {
      Item temp = items[i];
      if (temp != null && temp.getDescription().equals(search)){
        return temp;
      }
    }
    return null;
  }
  public void borrowItem (Item find){
    find.makeUnavailable();
  }
}
