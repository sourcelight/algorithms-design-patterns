/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.patterns.methodfactory;

public class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing a beef burger");
    }
}
