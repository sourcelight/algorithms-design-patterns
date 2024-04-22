package rick.example.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertSortRecursiveTest {

    @Test
    void test_givenUnsortedArray_whenSortedWithInsertionWithSize_thenArrayIsSorted() {

        InsertSortRecursive obj = new InsertSortRecursive();
        int[] actual = new int[]{4, 3, 1, 2, 5, 0};
        int[] expected = new int[]{0, 1, 2, 3, 4, 5};
        obj.sortInsertion(actual, actual.length);
        assertArrayEquals(expected, actual, () -> "the array is not sorted in the correct order");

    }

    @Test
    void test_givenUnsortedArray_whenSortedWithInsertion_thenArrayIsSorted() {

       InsertSortRecursive obj = new InsertSortRecursive();
/*      int[] actual = new int[]{9, 3, 1, 5, 13, 12, 7, 4, 0, 8, -7, -15};
        int[] expected = new int[]{-15, -7, 0, 1, 3, 4, 5, 7, 8, 9, 12, 13};*/

        int[] actual = new int[]{3, 1, 5, 4,};
        int[] expected = new int[]{1, 3, 4, 5};
        obj.sortInsertion(actual);
        assertArrayEquals(expected, actual, () -> "the array is not sorted in the correct order");

    }
}