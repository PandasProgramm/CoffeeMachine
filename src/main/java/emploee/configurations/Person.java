/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 *
 * Every employee has a personal account. THe account has got a id to add this account to a database-> (later)
 * for this project is a placeholder on line 30 to get a instance of a person. A Person is final. All account attributes
 * are final, expect the password for choice to change
 * @link Personbuilder to add a employee.
 */

package emploee.configurations;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import recipe.Recipe;
import java.util.LinkedList;
import java.util.List;


public final class Person{

    private final int id;
    private static int counter;

    private final String name;
    private   String password;
    private final  List<Recipe>recipes= new LinkedList<>();

  //  private static volatile Person instance;

    /**
     *
     * @param name final employee main attribute for login
     * @param password employee main attribute with option to change for login
     *
     *                 counter to automatically id settings by creating a new employee
     */
    public Person(String name,String password){
        counter++;
        this.id=counter;
        this.name=name;
        this.password=password;
        Recipe.basics(recipes);
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(!(obj instanceof Person))return false;

        Person person= (Person)obj;
        return this.id==person.id;
    }
    @Override
    public int hashCode() {
        return this.id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Recipe> getRecipes() {
        return recipes;
    }

    /**
     *@return option for JavaScript JSON
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString("Person " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'', ToStringStyle.JSON_STYLE);
    }
}
