package com.bodkasoft.ingredient;

/**
 * The {@code Ingredient} class is an abstract base class that represents a general ingredient in a recipe or dish.
 * It holds common properties such as caloric value and weight, which are applicable to any type of ingredient.
 *
 * <p>This class is intended to be extended by more specific ingredient types (e.g., vegetables, fruits, etc.),
 * which will add more specific properties and behavior.</p>
 */
public abstract class Ingredient {

    /**
     * The caloric value of the ingredient per 100 grams.
     */
    protected double calories;

    /**
     * The weight of the ingredient in grams.
     */
    protected double weight;

    /**
     * Constructs an {@code Ingredient} object with the specified caloric value and weight.
     *
     * @param calories the number of calories per 100 grams of the ingredient.
     * @param weight the weight of the ingredient in grams.
     */
    protected Ingredient(double calories, double weight) {
        this.calories = calories;
        this.weight = weight;
    }

    /**
     * Returns the caloric value of the ingredient.
     *
     * @return the number of calories per 100 grams.
     */
    public double getCalories() {
        return calories;
    }

    /**
     * Sets the caloric value of the ingredient.
     *
     * @param calories the number of calories to set.
     */
    public void setCalories(double calories) {
        this.calories = calories;
    }

    /**
     * Returns the weight of the ingredient.
     *
     * @return the weight of the ingredient in grams.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the ingredient.
     *
     * @param weight the weight of the ingredient to set, in grams.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Returns a string representation of the ingredient.
     *
     * <p>This method must be implemented by subclasses to provide specific details about the ingredient.</p>
     *
     * @return a string representation of the ingredient.
     */
    @Override
    public abstract String toString();
}
