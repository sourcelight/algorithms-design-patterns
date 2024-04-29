package rick.example.algorithms.binarysearch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchRecursiveTest {

    @Test
    void test_givenSortedArray_whenInputPresent_thenIndexFound() {

        int[] sortedArray= new int[]{1,3,5,7,9,11,56,98,123};
        BinarySearchRecursive searchRecursive = new BinarySearchRecursive();
        int actualIndex = searchRecursive.findBinaryRecursive(sortedArray,9,0,sortedArray.length);
        int expectedIndex =4;
        Assert.assertEquals(expectedIndex,actualIndex);
    }


    @Test
    void test_givenSortedArray_whenInputNotPresent_thenIndexNotFound() {

        int[] sortedArray= new int[]{1,3,5,7,9,11,56,98,123};
        BinarySearchRecursive searchRecursive = new BinarySearchRecursive();
        int actualIndex = searchRecursive.findBinaryRecursive(sortedArray,13,0,sortedArray.length);
        int expectedIndex =-1;
        Assert.assertEquals(expectedIndex,actualIndex);
    }
}