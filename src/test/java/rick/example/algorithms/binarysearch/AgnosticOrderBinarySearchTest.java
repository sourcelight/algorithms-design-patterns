package rick.example.algorithms.binarysearch;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgnosticOrderBinarySearchTest {
    int[] ascendingOrder;

    @BeforeEach
    void setUp() {
        ascendingOrder = new int[]{1, 3, 5, 7, 9, 11, 45, 78, 99};
    }


    @Test
    void test_givenArrayAscendingOrder_whenInputPresent_thenIndexFound() {

        int key = 9;
        int expectedIndex = 4;
        AgnosticOrderBinarySearch agnosticOrderBinarySearch = new AgnosticOrderBinarySearch();
        int actualIndex = agnosticOrderBinarySearch.findBinarySearchAgnostic(ascendingOrder, key);
        Assert.assertEquals(expectedIndex, actualIndex);

    }


    @Test
    void test_givenArrayDescendingOrder_whenInputPresent_thenIndexFound() {

        //Collections.reverse works for collections, not for Array
        //The function below is from apache common lang
        //I invert the order
        ArrayUtils.reverse(ascendingOrder);
        int key = 11;
        int expectedIndex = 3;
        AgnosticOrderBinarySearch agnosticOrderBinarySearch = new AgnosticOrderBinarySearch();
        int actualIndex = agnosticOrderBinarySearch.findBinarySearchAgnostic(ascendingOrder, key);
        Assert.assertEquals(expectedIndex, actualIndex);

    }


}