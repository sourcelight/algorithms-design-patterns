/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.stream;

import rick.example.functionalinterface.TestFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * this technique is used to avoid repeating heavy calculations(on a specific method).
 * In the map is stored as key the input value, if the value is not found in the map
 * the function is used to store the function's result as value, if present, the value is directed provided
 * without call again the method
 */
public class LazyEvaluationExample {

    public static void main(String[] args) {

        //loks below that memoize works witt different implementation Functions, in this case computeValue and computeValue(both are Function<T, R>)
        Function<Integer, Integer> memoizedComputation = memoize(LazyEvaluationExample::computeValue);
        Function<Integer, Integer> memoizedComputation2 = memoize(LazyEvaluationExample::computeValue2);

        //TestFunction testFunction = new TestFunction();
        //Function<Integer, Integer> memoizedComputation = memoize(testFunction);



//        A,B>Function<A,B>  memoizedGenericComputation = memoize(Function<A,B> func);



        System.out.println("Before lazy computation");
        System.out.println("Value: " + memoizedComputation.apply(10));
        System.out.println("Value: " + memoizedComputation.apply(10));
        System.out.println("Value: " + memoizedComputation2.apply(30));
        System.out.println("Value: " + memoizedComputation2.apply(30));
    }

    public static int computeValue(int input) {
        System.out.println("Computing value for input: " + input);
        return input * input;
    }

    public static int computeValue2(int input) {
        System.out.println("Computing value for input2: " + input);
        return input * input;
    }

    public static <T, R> Function<T, R> memoize(Function<T, R> function) {
        Map<T, R> cache = new HashMap<>();
        return input -> cache.computeIfAbsent(input, function);
    }
}
