
/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 */

package container;
public final class IngredientContainer extends Container {

    private String name;
    /**
     * @param name of the actually ingredient container
     * @param capacity of actually capacity of the actually ingredient container
     * @param capacityMax of maximal capacity of the actually ingredient container
     */
    public IngredientContainer(String name,double capacity,double capacityMax) {
        this.name = name;
        this.capacityMax=capacityMax;
        this.capacity=capacity;
    }
    /**
     * @param brewAction: functional interface for lambda expression
     * @return: the new capacity after brewing process
     */
    public double brew(BrewAction brewAction){
        return  brewAction.brewAction(capacityMax,capacity);
    }
}
