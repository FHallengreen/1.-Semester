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

  public Item[] getAvailableItems() { // Is supposed to make a new Item array leaving out null. However they are still displayed.
    Item[] availableItems = new Item[items.length];
    for (int i = 0; i < this.items.length; i++) {
      Item temp = items[i];
      if (temp != null) {
        availableItems[i] = temp;
      }
    }
    return availableItems;
  }

  public Item findItem (String search){ // Will search for a skateboard in the description.
    // Using the for loop, it will check the whole array for a matching description.
    for (int i = 0; i < items.length; i++) {
      Item temp = items[i];
      if (temp != null && temp.getDescription().equals(search)){
        return temp;
      }
    }
    return null;
  }
  public void borrowItem (Item found){ // Will make found Item unavailable.
    found.makeUnavailable();
  }
  public void returnItem (Item found){ // will put found Item available.
    found.makeAvailable();
  }
}
