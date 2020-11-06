
/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 * @link: Person, authorization in employee.configuration,
 * constant attributes for a recipe with constant amounts. getter to add a Recipe
 */


package recipe;

import java.util.List;

public final class Recipe {
    private final String name;
    private final Ingredient WATER;
    private final Ingredient COFFEE;
    private final Ingredient CACAO;
    private final Ingredient SUGAR;
    private final Ingredient MILK;

    public Recipe(String name,double waterAmount,double coffeeAmount,double cacaoAmount,double sugarAmount,double milkAmount){
        this.name=name;
        this.WATER=Ingredient.WATER;
        this.COFFEE=Ingredient.COFFEE;
        this.CACAO=Ingredient.CACAO;
        this.SUGAR=Ingredient.Sugar;
        this.MILK=Ingredient.MILK;
    }
    /**
     * @param recipeList to add standard recipes to a personal list of the person
     */
    public static void basics(List<Recipe> recipeList){
        recipeList.add(new Recipe("black coffee", Ingredient.WATER.getAmountInLiter(),Ingredient.COFFEE.getAmountInLiter(),
                0.0,0.0,0.0));
        recipeList.add(new Recipe("coffee with sugar",Ingredient.WATER.getAmountInLiter(),Ingredient.COFFEE.getAmountInLiter(),
                0.0,Ingredient.Sugar.getAmountInLiter(),0.0));
        recipeList.add(new Recipe("coffee with milk",Ingredient.WATER.getAmountInLiter(),Ingredient.COFFEE.getAmountInLiter(),
                0.0,0.0,Ingredient.MILK.getAmountInLiter()));
        recipeList.add(new Recipe("coffee with milk and sugar",Ingredient.WATER.getAmountInLiter(),Ingredient.COFFEE.getAmountInLiter(),
                0,Ingredient.Sugar.getAmountInLiter(), Ingredient.MILK.getAmountInLiter()));
        recipeList.add(new Recipe("cacao",Ingredient.WATER.getAmountInLiter(), 0,Ingredient.CACAO.getAmountInLiter(),
                0.,0));
    }

    public String getName() {
        return name;
    }
}
