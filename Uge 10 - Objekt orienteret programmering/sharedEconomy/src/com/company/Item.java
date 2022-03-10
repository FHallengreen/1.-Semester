package com.company;

public class Item {
    private String category;
    private String description;
    private boolean isAvailable;

    public Item(String category, String description) {
        this.category = category;
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "category = " + category + ", description = " + description;
    }

}

