/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 *
 * you can instance only one coffee machine for home
 * it is a singleton example in this project
 * a coffee machine has a entity with ingredient container and waste container
 * a coffee machine includes 5 ingredient container
 * a coffee machine includes one waste container but contains a array for using functional interface
 * every coffee machine has a few handle option to use-> includes in Object because a "has a" entity
 */

package maschine;
import container.IngredientContainer;
import container.WasteContainer;

public class CoffeeMachine {

    private static CoffeeMachine coffeeMachine;

    /**
     * @link: IngredientContainer
     * @link: WasteContainer
     * @link: MachineOptions
     *
     */
    private final IngredientContainer[] ingredientContainers;
    private final WasteContainer [] wasteContainers;
    private final MachineOptions machineOptions;

    private CoffeeMachine(){
        this.ingredientContainers=new IngredientContainer[5];
        this.wasteContainers= new WasteContainer[1];

        ingredientContainers[0]= new IngredientContainer("water",5,5);
        ingredientContainers[1]= new IngredientContainer("coffee",5,5);
        ingredientContainers[2]= new IngredientContainer("cacao",5,5);
        ingredientContainers[3]= new IngredientContainer("sugar",5,5);
        ingredientContainers[4]= new IngredientContainer("milk",0,5);
        wasteContainers[0]=new WasteContainer();
        machineOptions= new MachineOptions();
    }

    /**
     *
     * @return instance of the coffee machine
     */
    public static synchronized CoffeeMachine getInstance() {
        if (coffeeMachine == null) {
            return coffeeMachine = new CoffeeMachine();
        }
        return coffeeMachine;
    }

}