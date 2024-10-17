package com.bodkasoft.ingredient.vegetable;

import com.bodkasoft.ingredient.Vegetable;
import com.bodkasoft.ingredient.vegetable.vegetabletypes.CabbageType;

/**
 * The {@code Cabbage} class represents a specific type of vegetable, cabbage, which extends the {@link Vegetable} class.
 * It includes properties such as the type of cabbage and whether it is organic.
 *
 * <p>This class encapsulates specific details for cabbages, including their caloric value, weight, and organic status.
 * The type of cabbage is defined by the {@link CabbageType} enum.</p>
 */
public class Cabbage extends Vegetable {

    /**
     * The specific type of cabbage, represented by the {@link CabbageType} enum.
     */
    private CabbageType cabbageType;

    /**
     * Indicates whether the cabbage is organically grown.
     */
    private boolean isOrganic;

    /**
     * Constructs a {@code Cabbage} object with the specified caloric value, weight, type, and organic status.
     *
     * @param calories the caloric value of the cabbage per 100 grams.
     * @param weight the weight of the cabbage in grams.
     * @param type the specific type of cabbage (e.g., Green, Savoy, etc.) represented by {@link CabbageType}.
     * @param isOrganic a boolean indicating whether the cabbage is organically grown.
     */
    public Cabbage(double calories, double weight, CabbageType type, boolean isOrganic) {
        super(calories, weight);
        this.cabbageType = type;
        this.isOrganic = isOrganic;
    }

    /**
     * Returns the type of the cabbage.
     *
     * @return the {@link CabbageType} of the cabbage.
     */
    public CabbageType getCabbageType() {
        return cabbageType;
    }

    /**
     * Sets the type of the cabbage.
     *
     * @param cabbageType the type of cabbage to set, represented by {@link CabbageType}.
     */
    public void setCabbageType(CabbageType cabbageType) {
        this.cabbageType = cabbageType;
    }

    /**
     * Returns whether the cabbage is organically grown.
     *
     * @return {@code true} if the cabbage is organic, {@code false} otherwise.
     */
    public boolean isOrganic() {
        return isOrganic;
    }

    /**
     * Sets whether the cabbage is organically grown.
     *
     * @param organic {@code true} to mark the cabbage as organic, {@code false} otherwise.
     */
    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    /**
     * Returns a string representation of the cabbage, including its type, calories, weight, and organic status.
     *
     * @return a string representation of the cabbage.
     */
    @Override
    public String toString() {
        return "Cabbage{ " + "Type: " + cabbageType + ", calories: " + calories + ", isOrganic: " + isOrganic + ", weight: " + weight + " }";
    }
}
