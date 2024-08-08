/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.patterns.abstractfactorymethod.factories;

import rick.example.patterns.abstractfactorymethod.products.*;

public class MsiCompany extends Company{
    @Override
    public Gpu createGpu() {
        System.out.println("creating Msi gpu");
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("creating Msi monitor");
        return new MsiMonitor();
    }
}
