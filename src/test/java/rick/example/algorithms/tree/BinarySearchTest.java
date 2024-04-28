package rick.example.algorithms.tree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void given_orderedArray_whenInputIsPresent_thenReturnIndexExpected() {

        int[] sortedArray= new int[]{1,2,5,7,9,11,13,23,37,67};
        BinarySearch binarySearch = new BinarySearch();
        int actualIndex =binarySearch.findBinarySearch(sortedArray,23);
        int expectedIndex = 7;
        Assert.assertEquals(expectedIndex,actualIndex);

    }


    @Test
    void given_orderedArray_whenInputIsNotPresent_thenReturnNegativeValue() {

        int[] sortedArray= new int[]{1,2,5,7,9,11,13,23,37,67};
        BinarySearch binarySearch = new BinarySearch();
        int actualIndex =binarySearch.findBinarySearch(sortedArray,80);
        int expectedIndex = -1;
        Assert.assertEquals(expectedIndex,actualIndex);

    }


}