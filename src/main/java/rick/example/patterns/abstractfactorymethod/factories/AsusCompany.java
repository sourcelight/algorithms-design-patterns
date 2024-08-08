/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.patterns.abstractfactorymethod.factories;

import rick.example.patterns.abstractfactorymethod.products.AsusGpu;
import rick.example.patterns.abstractfactorymethod.products.AsusMonitor;
import rick.example.patterns.abstractfactorymethod.products.Gpu;
import rick.example.patterns.abstractfactorymethod.products.Monitor;

public class AsusCompany extends Company{
    @Override
    public Gpu createGpu() {
        System.out.println("creating Asus gpu");
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("creating Asus monitor");
        return new AsusMonitor();
    }
}
