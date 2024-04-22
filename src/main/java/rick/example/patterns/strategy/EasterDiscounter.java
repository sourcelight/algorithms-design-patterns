/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.patterns.strategy;

import java.math.BigDecimal;

public class EasterDiscounter implements Discounter {

    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }
}
