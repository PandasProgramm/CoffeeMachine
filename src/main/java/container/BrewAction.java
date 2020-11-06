
/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 * @link:  container, ingredient container, waste container
 *
 * a functional Interface to use lambda
 */
package container;
@FunctionalInterface
public interface BrewAction {
    /**
     * @param a of max capacity of the container
     * @param b of b actually capacity of the container
     * @return maximal capacity for a ingredient Container or ->
     * @return maximal capacity of the waste container after maintenance
     */
    double brewAction(double a,double b);
}
