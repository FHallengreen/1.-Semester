package com.company;

public class Item {
    private String category;
    private String description;
    private boolean isAvailable = true;

    public Item(String category, String description) {
        this.category = category;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void makeAvailable (){
        isAvailable = true;
    }
    public void makeUnavailable (){
        isAvailable = false;
    }

    public boolean showAvailability (){
        return isAvailable;
    }


    @Override
    public String toString() {
        return
                "category = " + category + ", description = " + description;
    }

}

