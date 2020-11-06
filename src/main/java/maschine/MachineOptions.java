
/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 */

package maschine;

import container.IngredientContainer;
import container.WasteContainer;
import recipe.Recipe;

import java.util.List;

class MachineOptions {

    /**
     * @param wasteContainers to empty capacity
     * @param ingredientContainers to fill up capacity to maximal volume
     * @param maintenance is a functional Interface to use lambda expression for the machine maintenance
     */
    public void refill(WasteContainer[]wasteContainers, IngredientContainer[]ingredientContainers, Maintenance maintenance) {
        maintenance.maintenance(ingredientContainers);
        maintenance.maintenance(wasteContainers);
    }

    /**
     * @param recipe for preparing a new drink
     */
    public void prepareDrink(Recipe recipe) {

    }

    /**
     * @param recipeList to show all added recipes
     * @link Recipe
     */
    public void showRecipe(List<Recipe>recipeList){
        recipeList.forEach(recipe -> {System.out.println(recipe);});
    }
}
