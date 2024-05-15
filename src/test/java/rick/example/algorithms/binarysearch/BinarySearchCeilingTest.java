/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.binarysearch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinarySearchCeilingTest {


    @Test
    void given_SortedArray_whenKeyIsPresent_thenReturnCorrectKeyIndex() {

        int[] sortedArray = new int[]{1, 3, 5, 8, 10, 15};
        int key = 8;
        BinarySearchCeiling searchCeiling = new BinarySearchCeiling();

        int actualIndex = searchCeiling.findBinarySearchCeiling(sortedArray, key);
        int expectedIndex = 3;
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void given_SortedArray_whenKeyIsNotPresentAndLowerThanMaxArrayValue_thenReturnCorrectCeilingIndex() {

        int[] sortedArray = new int[]{1, 3, 5, 8, 10, 15};
        int key = 9;
        BinarySearchCeiling searchCeiling = new BinarySearchCeiling();

        int actualIndex = searchCeiling.findBinarySearchCeiling(sortedArray, key);
        int expectedIndex = 4;
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void given_SortedArray_whenKeyIsNotPresentAndBiggerThanMaxArrayValue_thenReturnMinusOne() {

        int[] sortedArray = new int[]{1, 3, 5, 8, 10, 15};
        int key = 18;
        BinarySearchCeiling searchCeiling = new BinarySearchCeiling();

        int actualValue = searchCeiling.findBinarySearchCeiling(sortedArray, key);
        int expectedValue = -1;
        Assert.assertEquals(expectedValue, actualValue);
    }

}
