package rick.example.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    @Test
    void merge() {
        Sort obj = new Sort();
        int[] first = new int[]{1, 3, 9,};
        int[] second = new int[]{5, 12, 13};
        int[] full = new int[]{9, 3, 1, 5, 13, 12};
        int[] expected = new int[]{1, 3, 5, 9, 12, 13};
        obj.merge(full,first,second,first.length,second.length);
        assertArrayEquals(expected, full, () -> "the array is not sorted in the correct order");
    }

    @Test
    void mergeSort() {

        Sort obj = new Sort();
        int[] actual = new int[]{9, 3, 1, 5, 13, 12, 7, 4, 0, 8, -7, -15};
        int[] expected = new int[]{-15, -7, 0, 1, 3, 4, 5, 7, 8, 9, 12, 13};
        obj.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual, () -> "the array is not sorted in the correct order");

    }
}
