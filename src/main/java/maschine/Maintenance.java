
/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 * @link:  container, ingredient container, waste container
 */
package maschine;

import container.Container;

@FunctionalInterface
public interface Maintenance {
    /**
     *
     * @param ingredientContainer in polymorphism to contains all kind of container for maintain the coffee machine in
     *                            using lambda expression
     */
    public void maintenance(Container []ingredientContainer);
}
