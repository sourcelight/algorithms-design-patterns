/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.patterns.abstractfactorymethod.products;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("assembling Msi monitor");
    }
}
