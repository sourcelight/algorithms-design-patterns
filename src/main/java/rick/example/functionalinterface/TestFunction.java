/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.functionalinterface;

import java.util.function.Function;

public class TestFunction<T,R> implements Function<T,R> {


    @Override
    public R apply(T t) {
        return null;
    }

    @Override
    public <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
        return Function.super.compose(before);
    }

    @Override
    public <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
        return Function.super.andThen(after);
    }
}



