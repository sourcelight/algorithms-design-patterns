package rick.example.patterns.abstractfactorymethod.factories;

import rick.example.patterns.abstractfactorymethod.products.Gpu;
import rick.example.patterns.abstractfactorymethod.products.Monitor;

public abstract class Company {


    public Gpu orderGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public Monitor orderMonitor() {
        Monitor mon = createMonitor();
        mon.assemble();
        return mon;
    }

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
