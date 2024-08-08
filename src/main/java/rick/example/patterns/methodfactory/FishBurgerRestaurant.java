/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.patterns.methodfactory;

public class FishBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        System.out.println("creating a fish burger");
        return new FishBurger();
    }
}
