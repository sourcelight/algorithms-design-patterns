package rick.example.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {

    @Test
    void insertSort() {

        InsertSort obj = new InsertSort();
        int[] actual = new int[]{9, 3, 1, 5, 13, 12, 7, 4, 0, 8, -7, -15};
        int[] expected = new int[]{-15, -7, 0, 1, 3, 4, 5, 7, 8, 9, 12, 13};
        obj.insertSort(actual);
        assertArrayEquals(expected, actual, () -> "the array is not sorted in the correct order");
    }
}