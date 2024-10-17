package com.bodkasoft.ingredient.fruit;

import com.bodkasoft.ingredient.Fruit;
import com.bodkasoft.ingredient.fruit.fruittypes.BananaType;

/**
 * The {@code Banana} class represents a type of fruit specifically for bananas.
 * It extends the {@link Fruit} class and adds properties specific to bananas,
 * such as their type.
 *
 * <p>This class includes methods to access and modify the properties of a banana,
 * including its caloric content, weight, and type. It provides a string representation
 * of a banana object that includes its attributes.</p>
 */
public class Banana extends Fruit {

    private BananaType bananaType;

    /**
     * Constructs a {@code Banana} object with the specified caloric content, weight, and type.
     *
     * @param calories the caloric content of the banana
     * @param weight   the weight of the banana
     * @param type     the type of the banana, represented by a {@link BananaType}
     */
    public Banana(double calories, double weight, BananaType type) {
        super(calories, weight);
        this.bananaType = type;
    }

    /**
     * Returns the type of this banana.
     *
     * @return the type of the banana as a {@link BananaType}
     */
    public BananaType getBananaType() {
        return bananaType;
    }

    /**
     * Sets the type of this banana.
     *
     * @param bananaType the new type to be set for this banana
     */
    public void setBananaType(BananaType bananaType) {
        this.bananaType = bananaType;
    }

    /**
     * Returns a string representation of the banana object.
     * This representation includes the caloric content, weight, and type of the banana.
     *
     * @return a string representation of the banana
     */
    @Override
    public String toString() {
        return "Banana[ " + "calories=" + calories + ", weight=" + weight + ", type=" + bananaType + " ]";
    }
}
