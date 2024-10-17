package com.bodkasoft;

import com.bodkasoft.ingredient.Vegetable;
import com.bodkasoft.ingredient.vegetable.Cabbage;
import com.bodkasoft.ingredient.vegetable.Cucumber;
import com.bodkasoft.ingredient.vegetable.Pepper;
import com.bodkasoft.ingredient.vegetable.Tomato;
import com.bodkasoft.salad.SummerSalad;
import com.bodkasoft.ingredient.vegetable.vegetabletypes.CabbageType;
import com.bodkasoft.ingredient.vegetable.vegetabletypes.CucumberType;
import com.bodkasoft.ingredient.vegetable.vegetabletypes.PepperType;
import com.bodkasoft.ingredient.vegetable.vegetabletypes.TomatoType;

import java.util.Arrays;
import java.util.Optional;

/**
 * C13 = 3
 * <p>
 * The {@code Main} class demonstrates the creation of a vegetable salad using various types of vegetables.
 * It calculates the total calories of the salad, sorts the vegetables by their calorie content,
 * and finds a vegetable within a specified calorie range.
 *
 * <p>This class uses the {@link SummerSalad} class to handle the salad operations and displays the results in the console.</p>
 *
 * <p>The vegetables used in the salad are:</p>
 * <ul>
 *     <li>{@link Pepper} (Type: CHILI)</li>
 *     <li>{@link Cabbage} (Type: PEKING)</li>
 *     <li>{@link Tomato} (Type: CHERRY)</li>
 *     <li>{@link Cucumber} (Type: CORNICHON)</li>
 * </ul>
 *
 * <p>In the {@code main} method, the following tasks are performed:</p>
 * <ol>
 *     <li>Display the salad elements (vegetables).</li>
 *     <li>Calculate and display the total caloric value of the salad.</li>
 *     <li>Sort and display the vegetables in the salad based on their caloric content.</li>
 *     <li>Find and display a vegetable that falls within a specified calorie range.</li>
 * </ol>
 */
public class Main {

    /**
     * A static array of vegetables used to create the salad.
     * The array includes various types of vegetables such as peppers, cabbages, tomatoes, and cucumbers.
     */
    private static final Vegetable[] vegetables = new Vegetable[]{
        new Pepper(280.2, 100.20, PepperType.CHILI, true),
        new Cabbage(26.1, 200.44, CabbageType.PEKING, true),
        new Tomato(30.1, 200.58, TomatoType.CHERRY, true),
        new Cucumber(13.3, 120.23, CucumberType.CORNICHON, 95, false, 10, true)
    };

    /**
     * The main method of the {@code Main} class.
     * This method creates a {@link SummerSalad} object with the provided array of vegetables and performs the following operations:
     * <ul>
     *     <li>Displays the list of vegetables in the salad.</li>
     *     <li>Calculates and displays the total caloric value of the salad.</li>
     *     <li>Sorts and displays the vegetables based on their caloric content.</li>
     *     <li>Finds and displays a vegetable whose caloric content is within a specified range.</li>
     * </ul>
     *
     * <p>If no vegetable is found within the specified calorie range, an error is thrown and displayed.</p>
     */
    public static void main(String[] args) {
        try{
            // Create a new SummerSalad with the provided vegetables
            SummerSalad<Vegetable> summerSalad = new SummerSalad<>(vegetables);

            // Display the vegetables in the salad
            System.out.println("<---Your vegetable salad--->");
            for(Vegetable vegetable: summerSalad.getSaladElements()){
                System.out.println(vegetable);
            }
            System.out.println();

            // Display the total caloric value of the salad
            System.out.println("<---Calories of your salad--->");
            System.out.println(summerSalad.caloricValue());
            System.out.println();

            // Sort and display the salad based on calories
            System.out.println("<---Sorted salad by calories--->");
            Vegetable[] sortedVegetables = summerSalad.sortSaladBy(Vegetable::getCalories);
            for(Vegetable vegetable: sortedVegetables){
                System.out.println(vegetable);
            }
            System.out.println();

            // Find and display a vegetable within a specified calorie range
            double min = 20, max = 30;
            System.out.println("<---Vegetable in range ( " + min + " ; " + max + " )--->");
            Optional<Vegetable> found = summerSalad.getItemsByCaloriesRange(min, max);

            if(found.isPresent()){
                System.out.println(found.get());
            }else {
                throw new RuntimeException("No vegetable found");
            }

            System.out.println();
        }catch (IllegalArgumentException | NullPointerException e){
            // Handle any errors during the process
            System.out.println("Error: " + e.getMessage());
        }

    }
}