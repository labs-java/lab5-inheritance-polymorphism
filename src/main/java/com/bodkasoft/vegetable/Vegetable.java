package com.bodkasoft.vegetable;

public class Vegetable {
    private String name;
    private int calories;
    private double weight;

    public Vegetable(String name, int kcal, double weight) {
        this.name = name;
        this.calories = kcal;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " (калорійність: " + calories + " ккал/100г, вага: " + weight + "г)";
    }
}
