package com.bodkasoft.ingredient;

/**
 * The {@code Fruit} class is an abstract subclass of {@link Ingredient} that represents a fruit ingredient.
 * It provides a structure for fruit-specific ingredients, such as caloric value and weight.
 *
 * <p>This class is designed to be extended by specific fruit types (e.g., apple, banana, etc.),
 * each of which may add additional properties or methods unique to those fruits.</p>
 *
 * <p>The class holds basic information like calories and weight, while more specific details
 * should be handled in the subclasses.</p>
 */
public abstract class Fruit extends Ingredient {

    /**
     * Constructs a {@code Fruit} object with the specified caloric value and weight.
     *
     * @param calories the caloric value of the fruit per 100 grams.
     * @param weight the weight of the fruit in grams.
     */
    protected Fruit(double calories, double weight) {
        super(calories, weight);
    }
}
