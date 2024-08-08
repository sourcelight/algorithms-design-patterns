/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.patterns.abstractfactorymethod.products;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("assembling Msi gpu");
    }
}
