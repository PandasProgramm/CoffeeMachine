/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 *
 * to have a option to add authorization lvl based on the competence to add Recipe or remove recipe
 * every employee has handle competences
 */
package emploee.configurations;

import recipe.Recipe;
import java.util.List;

public  class Authorization {

    /**
     * @param recipes  foundations of the product @link{Recipe}
     * @param waterAmount  standard amount is 0.2liter @link{Ingredient}
     * @param coffeeAmount standard amount is 0.02liter @link{Ingredient}
     * @param cacaoAmount  standard amount is 0.2liter @link{Ingredient}
     * @param sugarAmount  standard amount is 0.02liter @link{Ingredient}
     * @param milkAmount   standard amount is 0.02liter @link{Ingredient}
     */
    void addRecipe(List<Recipe> recipes, String name, double waterAmount, double coffeeAmount, double cacaoAmount, double sugarAmount, double milkAmount){
        recipes.add(new Recipe(name,waterAmount,coffeeAmount,cacaoAmount,sugarAmount,milkAmount));
    }

    /**
     * @param recipes foundations of the product @link{Recipe}
     * @param inputName for searching recipe name to remove this recipe
     */
    void removeRecipe(List<Recipe>recipes,String inputName){
        // -> holder for authorization
        recipes.forEach(recipe -> {if(recipe.getName().equalsIgnoreCase(inputName)){
            recipes.remove(recipe);}
        });
    }
}
