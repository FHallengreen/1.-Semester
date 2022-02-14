package com.company;

public class FoodSort{

    public double kcal;
    public double protein;
    public double carbs;
    public double sugar;
    public double fat;

    public FoodSort(double kcal, double protein, double carbs, double sugar, double fat) {
        this.kcal = kcal;
        this.protein = protein;
        this.carbs = carbs;
        this.sugar = sugar;
        this.fat = fat;
    }

    public double getKcal() {
        return kcal;
    }

    public double getProtein() {
        return protein;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getSugar() {
        return sugar;
    }

    public double getFat() {
        return fat;
    }
}
