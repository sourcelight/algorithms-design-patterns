/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.patterns.abstractfactorymethod.products;

import rick.example.patterns.abstractfactorymethod.factories.AsusCompany;
import rick.example.patterns.abstractfactorymethod.factories.Company;
import rick.example.patterns.abstractfactorymethod.factories.MsiCompany;

public class DemoAbstractFactory {

    public static void main(String[] args) {

        System.out.println("--------------------");
        Company asusCompany= new AsusCompany();
        asusCompany.orderGpu();
        System.out.println("--------------------");
        asusCompany.orderMonitor();
        System.out.println("--------------------");
        System.out.println("--------------------");

        Company msiCompany= new MsiCompany();
        msiCompany.orderGpu();
        System.out.println("--------------------");
        msiCompany.orderMonitor();

    }
}
