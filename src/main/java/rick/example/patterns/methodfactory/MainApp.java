/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.patterns.methodfactory;


/**
 * Implementation of factory method pattern
 * Video Reference: https://youtu.be/EdFq_JIThqM
 */
public class MainApp {

    public static void main(String[] args) {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        beefRestaurant.orderBurger();

        System.out.println("---------------------------");

        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        veggieRestaurant.orderBurger();

        System.out.println("---------------------------");

        Restaurant fishRestaurant = new FishBurgerRestaurant();
        fishRestaurant.orderBurger();




    }




}
