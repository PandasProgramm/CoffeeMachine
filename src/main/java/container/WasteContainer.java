
/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 * @param: name: name of the actually ingredient container
 *         capacity: actually capacity of the actually ingredient container
 *         capacityMax: maximal capacity of the actually ingredient container
 */
package container;

public final class WasteContainer extends Container{

    public double brewWaste(BrewAction brewAction){
        return  brewAction.brewAction(capacityMax,capacity);
    }

}
