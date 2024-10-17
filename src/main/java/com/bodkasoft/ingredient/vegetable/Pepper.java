package com.bodkasoft.ingredient.vegetable;

import com.bodkasoft.ingredient.Vegetable;
import com.bodkasoft.ingredient.vegetable.vegetabletypes.PepperType;

/**
 * The {@code Pepper} class represents a specific type of vegetable, a pepper, which extends the {@link Vegetable} class.
 * It includes properties such as the type of pepper and whether it is organic.
 *
 * <p>This class encapsulates specific details for peppers, including their caloric value, weight, and whether they are organically grown.
 * The type of pepper is defined by the {@link PepperType} enum.</p>
 */
public class Pepper extends Vegetable {

    /**
     * The specific type of pepper, represented by the {@link PepperType} enum.
     */
    private PepperType pepperType;

    /**
     * Indicates whether the pepper is organically grown.
     */
    private boolean isOrganic;

    /**
     * Constructs a {@code Pepper} object with the specified caloric value, weight, type, and organic status.
     *
     * @param calories the caloric value of the pepper per 100 grams.
     * @param weight the weight of the pepper in grams.
     * @param type the specific type of pepper (e.g., Bell, Chili, etc.) represented by {@link PepperType}.
     * @param isOrganic a boolean indicating whether the pepper is organically grown.
     */
    public Pepper(double calories, double weight, PepperType type, boolean isOrganic) {
        super(calories, weight);
        this.pepperType = type;
        this.isOrganic = isOrganic;
    }

    /**
     * Returns the type of the pepper.
     *
     * @return the {@link PepperType} of the pepper.
     */
    public PepperType getPepperType() {
        return pepperType;
    }

    /**
     * Sets the type of the pepper.
     *
     * @param pepperType the type of pepper to set, represented by {@link PepperType}.
     */
    public void setPepperType(PepperType pepperType) {
        this.pepperType = pepperType;
    }

    /**
     * Returns whether the pepper is organically grown.
     *
     * @return {@code true} if the pepper is organic, {@code false} otherwise.
     */
    public boolean isOrganic() {
        return isOrganic;
    }

    /**
     * Sets whether the pepper is organically grown.
     *
     * @param organic {@code true} to mark the pepper as organic, {@code false} otherwise.
     */
    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    /**
     * Returns a string representation of the pepper, including its type, calories, and weight.
     *
     * @return a string representation of the pepper.
     */
    @Override
    public String toString() {
        return "Pepper{ " + "Type: " + pepperType + ", calories: " + calories + ", weight: " + weight + " }";
    }
}
