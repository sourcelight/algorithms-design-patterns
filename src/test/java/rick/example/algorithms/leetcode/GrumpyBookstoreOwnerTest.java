package rick.example.algorithms.leetcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class GrumpyBookstoreOwnerTest {

    @Test
    void maxSatisfied() {

        int[] customers = new int[]{1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = new int[]{0, 1, 0, 1, 0, 1, 0, 1};
        int minutes = 3;

        GrumpyBookstoreOwner grumpyBookstoreOwner = new GrumpyBookstoreOwner();
        int actualOutput = grumpyBookstoreOwner.maxSatisfied(customers, grumpy, minutes);
        int expectedOutput = 16;
        Assert.assertEquals(expectedOutput,actualOutput);

    }
}