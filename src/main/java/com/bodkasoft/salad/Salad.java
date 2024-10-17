package com.bodkasoft.salad;

/**
 * The {@code Salad} class is an abstract generic class representing a salad made up of various ingredients.
 * It provides basic functionality for storing and retrieving the elements (ingredients) of the salad.
 *
 * <p>The specific types of ingredients and operations on the salad are defined by subclasses.</p>
 *
 * @param <T> the type of elements (ingredients) that extend this class.
 */
public abstract class Salad<T> {

    /**
     * The array of elements (ingredients) that make up the salad.
     */
    protected T[] elements;

    /**
     * Constructs a {@code Salad} object with the provided array of elements (ingredients).
     *
     * <p>The constructor ensures that the array of elements is neither {@code null} nor empty.</p>
     *
     * @param elements the array of ingredients to be used in the salad.
     * @throws IllegalArgumentException if the {@code elements} array is {@code null} or empty.
     */
    protected Salad(T[] elements) {
        if (elements == null || elements.length == 0) {
            throw new IllegalArgumentException("Salad elements can not be null or empty");
        }
        this.elements = elements;
    }

    /**
     * Returns the array of ingredients that make up the salad.
     *
     * @return the array of salad elements.
     */
    public abstract T[] getSaladElements();
}
