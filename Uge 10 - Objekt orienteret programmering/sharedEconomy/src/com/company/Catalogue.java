package com.company;

import java.util.Arrays;

public class Catalogue {

    private int catalogueSize;
    private Item [] items;
    private int count;

    public Catalogue(int itemsSize) {
        items = new Item [itemsSize];
    }

    public void addItem(Item item) {
        items[count] = item;
            count++;
        }


    public Item[] getFullList() {
        return items;
        }

    public Item[] getAvailableItems() {
    return items;
    }

}

