package com.bodkasoft.ingredient.vegetable;

import com.bodkasoft.ingredient.Vegetable;
import com.bodkasoft.ingredient.vegetable.vegetabletypes.TomatoType;

/**
 * The {@code Tomato} class represents a specific type of vegetable, a tomato, which extends the {@link Vegetable} class.
 * It includes properties such as the type of tomato and whether the tomato is ripe.
 *
 * <p>This class encapsulates specific details for tomatoes, including caloric value, weight, and ripeness state.
 * It also allows for setting and retrieving the type of tomato via the {@link TomatoType} enum.</p>
 */
public class Tomato extends Vegetable {

    /**
     * The specific type of tomato, represented by the {@link TomatoType} enum.
     */
    private TomatoType tomatoType;

    /**
     * Indicates whether the tomato is ripe.
     */
    private boolean isRipe;

    /**
     * Constructs a {@code Tomato} object with the specified caloric value, weight, type, and ripeness.
     *
     * @param calories the caloric value of the tomato per 100 grams.
     * @param weight the weight of the tomato in grams.
     * @param type the specific type of tomato (e.g., Cherry, Roma, etc.) represented by {@link TomatoType}.
     * @param isRipe a boolean indicating whether the tomato is ripe.
     */
    public Tomato(double calories, double weight, TomatoType type, boolean isRipe) {
        super(calories, weight);
        this.tomatoType = type;
        this.isRipe = isRipe;
    }

    /**
     * Returns the type of the tomato.
     *
     * @return the {@link TomatoType} of the tomato.
     */
    public TomatoType getTomatoType() {
        return tomatoType;
    }

    /**
     * Sets the type of the tomato.
     *
     * @param tomatoType the type of tomato to set, represented by {@link TomatoType}.
     */
    public void setTomatoType(TomatoType tomatoType) {
        this.tomatoType = tomatoType;
    }

    /**
     * Returns whether the tomato is ripe.
     *
     * @return {@code true} if the tomato is ripe, {@code false} otherwise.
     */
    public boolean isRipe() {
        return isRipe;
    }

    /**
     * Sets the ripeness of the tomato.
     *
     * @param ripe {@code true} to mark the tomato as ripe, {@code false} otherwise.
     */
    public void setRipe(boolean ripe) {
        isRipe = ripe;
    }

    /**
     * Returns a string representation of the tomato, including its type, calories, ripeness, and weight.
     *
     * @return a string representation of the tomato.
     */
    @Override
    public String toString() {
        return "Tomato{ " + "Type: " + tomatoType + ", calories: " + calories + ", isRipe: " + isRipe + ", weight: " + weight + " }";
    }
}
