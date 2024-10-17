package com.bodkasoft.ingredient;

/**
 * The {@code Vegetable} class is an abstract subclass of {@link Ingredient}, representing a vegetable ingredient in a salad.
 * It provides the base functionality for vegetables, including caloric content and weight.
 *
 * <p>This class is meant to be extended by specific types of vegetables, which may add additional properties or behavior.</p>
 *
 * @see Ingredient
 */
public abstract class Vegetable extends Ingredient {

    /**
     * Constructs a {@code Vegetable} object with the specified caloric value and weight.
     *
     * <p>This constructor initializes the vegetable with its calories and weight. The specific type of vegetable
     * is determined by the subclass that extends {@code Vegetable}.</p>
     *
     * @param calories the caloric value of the vegetable per 100 grams.
     * @param weight the weight of the vegetable in grams.
     */
    protected Vegetable(double calories, double weight) {
        super(calories, weight);
    }
}
