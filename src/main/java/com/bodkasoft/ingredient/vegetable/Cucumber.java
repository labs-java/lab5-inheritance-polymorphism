package com.bodkasoft.ingredient.vegetable;

import com.bodkasoft.ingredient.Vegetable;
import com.bodkasoft.ingredient.vegetable.vegetabletypes.CucumberType;

/**
 * The {@code Cucumber} class represents a specific type of vegetable, a cucumber, which extends the {@link Vegetable} class.
 * It includes properties such as the type of cucumber, water content, whether it is bitter, length, and whether it is organic.
 *
 * <p>This class encapsulates specific details for cucumbers, including their caloric value, weight, water content, and other properties.
 * The type of cucumber is defined by the {@link CucumberType} enum.</p>
 */
public class Cucumber extends Vegetable {

    /**
     * The specific type of cucumber, represented by the {@link CucumberType} enum.
     */
    private CucumberType cucumberType;

    /**
     * The water content of the cucumber as a percentage (e.g., 95% water content).
     */
    private double waterContent;

    /**
     * Indicates whether the cucumber is bitter.
     */
    private boolean isBitter;

    /**
     * The length of the cucumber in centimeters.
     */
    private double length;

    /**
     * Indicates whether the cucumber is organically grown.
     */
    private boolean isOrganic;

    /**
     * Constructs a {@code Cucumber} object with the specified caloric value, weight, type, water content, bitterness, length, and organic status.
     *
     * @param calories the caloric value of the cucumber per 100 grams.
     * @param weight the weight of the cucumber in grams.
     * @param type the specific type of cucumber (e.g., English, Cornichon, etc.) represented by {@link CucumberType}.
     * @param waterContent the water content of the cucumber as a percentage.
     * @param isBitter a boolean indicating whether the cucumber is bitter.
     * @param length the length of the cucumber in centimeters.
     * @param isOrganic a boolean indicating whether the cucumber is organically grown.
     */
    public Cucumber(double calories, double weight, CucumberType type, double waterContent, boolean isBitter, double length, boolean isOrganic) {
        super(calories, weight);
        this.cucumberType = type;
        this.waterContent = waterContent;
        this.isBitter = isBitter;
        this.length = length;
        this.isOrganic = isOrganic;
    }

    /**
     * Returns the type of the cucumber.
     *
     * @return the {@link CucumberType} of the cucumber.
     */
    public CucumberType getCucumberType() {
        return cucumberType;
    }

    /**
     * Sets the type of the cucumber.
     *
     * @param cucumberType the type of cucumber to set, represented by {@link CucumberType}.
     */
    public void setCucumberType(CucumberType cucumberType) {
        this.cucumberType = cucumberType;
    }

    /**
     * Returns the water content of the cucumber.
     *
     * @return the water content of the cucumber as a percentage.
     */
    public double getWaterContent() {
        return waterContent;
    }

    /**
     * Sets the water content of the cucumber.
     *
     * @param waterContent the water content to set as a percentage.
     */
    public void setWaterContent(double waterContent) {
        this.waterContent = waterContent;
    }

    /**
     * Returns whether the cucumber is bitter.
     *
     * @return {@code true} if the cucumber is bitter, {@code false} otherwise.
     */
    public boolean isBitter() {
        return isBitter;
    }

    /**
     * Sets whether the cucumber is bitter.
     *
     * @param bitter {@code true} to mark the cucumber as bitter, {@code false} otherwise.
     */
    public void setBitter(boolean bitter) {
        isBitter = bitter;
    }

    /**
     * Returns the length of the cucumber.
     *
     * @return the length of the cucumber in centimeters.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the cucumber.
     *
     * @param length the length to set in centimeters.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Returns whether the cucumber is organically grown.
     *
     * @return {@code true} if the cucumber is organic, {@code false} otherwise.
     */
    public boolean isOrganic() {
        return isOrganic;
    }

    /**
     * Sets whether the cucumber is organically grown.
     *
     * @param organic {@code true} to mark the cucumber as organic, {@code false} otherwise.
     */
    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    /**
     * Returns a string representation of the cucumber, including its type, calories, weight, water content, bitterness, length, and organic status.
     *
     * @return a string representation of the cucumber.
     */
    @Override
    public String toString() {
        return "Cucumber{ " + "Type: " + cucumberType + ", calories: " + calories + ", weight: " + weight + ", waterContent: "
                + waterContent + ", isBitter: " + isBitter + ", isOrganic: "
                + isOrganic + ", length: " + length + ", isOrganic: " + isOrganic + " }";
    }
}
