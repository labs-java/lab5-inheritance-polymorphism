package com.bodkasoft.salad;

import com.bodkasoft.ingredient.Ingredient;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;

/**
 * The {@code SummerSalad} class represents a type of salad made from ingredients that extend the {@link Ingredient} class.
 * It provides methods to calculate the total caloric value of the salad, sort the salad elements based on a given parameter,
 * and find a specific ingredient within a specified range of caloric values.
 *
 * <p>This class extends the {@link Salad} class and adds functionality specific to a summer vegetable salad.</p>
 *
 * @param <T> The type of ingredients that extend {@link Ingredient} used in this salad.
 */
public class SummerSalad<T extends Ingredient> extends Salad<T> {

    /**
     * Constructs a {@code SummerSalad} object with the specified array of salad elements.
     *
     * @param saladElements the array of ingredients used to make the salad.
     * @throws NullPointerException if the {@code saladElements} array is {@code null}.
     */
    public SummerSalad(T[] saladElements) {
        super(saladElements);
    }

    /**
     * Calculates the total caloric value of the salad by summing the calories of all the ingredients.
     *
     * @return the total number of calories in the salad.
     */
    public double caloricValue(){
        double total = 0;
        for (T saladItem : elements) {
            total += saladItem.getCalories();
        }
        return total;
    }

    /**
     * Sorts the salad ingredients by a given parameter, defined by the {@code sortBy} function.
     *
     * <p>The sorting is done in ascending order based on the result of applying the {@code sortBy} function to each element.</p>
     *
     * @param sortBy a {@link Function} that takes an ingredient of type {@code T} and returns a {@code Double} to be used for sorting.
     * @return a sorted array of ingredients by the given parameter.
     * @throws NullPointerException if the {@code sortBy} function is {@code null}.
     */
    public T[] sortSaladBy(Function<T, Double> sortBy) {
        if (sortBy == null) {
            throw new NullPointerException("Sort by is null");
        }
        Arrays.sort(elements, Comparator.comparing(sortBy));
        return elements;
    }

    /**
     * Finds an ingredient in the salad whose caloric value falls within the specified range.
     *
     * @param min the minimum caloric value (inclusive).
     * @param max the maximum caloric value (inclusive).
     * @return an {@link Optional} containing the first ingredient found within the specified range, or an empty {@code Optional} if none is found.
     * @throws IllegalArgumentException if {@code min} is greater than {@code max}.
     */
    public Optional<T> getItemsByCaloriesRange(double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value must be less than or equal to max value");
        }
        return Arrays.stream(elements)
                .filter(saladItem -> saladItem.getCalories() >= min && saladItem.getCalories() <= max)
                .findFirst();
    }

    /**
     * Returns the array of salad elements (ingredients) that make up the salad.
     *
     * @return the array of salad ingredients.
     */
    @Override
    public T[] getSaladElements() {
        return elements;
    }
}
