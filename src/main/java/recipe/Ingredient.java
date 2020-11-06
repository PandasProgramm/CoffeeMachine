
/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 * @link: Recipe
 * constant attributes for a recipe with constant amounts. getter to add a Recipe
 */

package recipe;

import java.util.TreeSet;

public enum Ingredient {

    WATER(0.2), COFFEE(0.02), CACAO(0.02), Sugar(0.02), MILK(0.02);

    public double getAmountInLiter() {
                    return amountInLiter;
                }


    double amountInLiter;

    private Ingredient(double amountInLiter) {
        this.amountInLiter = amountInLiter;
    }

TreeSet


}
