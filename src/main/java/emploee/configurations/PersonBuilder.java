
/**
 * @author: Miguel Gutierrez
 * @version:2.0
 * @since: 1.8
 *
 * Every employee has a personal account. A Person is final beause of this i create a builder
 * @link Person
 */

package emploee.configurations;

public class PersonBuilder {

    private  String name;
    private  String password;

    public PersonBuilder(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Person build(){
        return new Person(this.name,this.password);
    }
}
