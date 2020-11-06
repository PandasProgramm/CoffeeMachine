/**
 *@author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 * @link: ingredient Container
 * the container class contain the actually capacity and the max capacity of the container object
 *
 */
package container;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class Container {

    double capacity;
    double capacityMax;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString("Container capacity=" + capacity + ", capacityMax=" + capacityMax,
                                                  ToStringStyle.JSON_STYLE);
    }
}
