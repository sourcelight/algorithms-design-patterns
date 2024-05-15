package rick.example.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MissingNumberXORTest {

    @Test
    void test_givenArrayMissingNumber_whenSearched_thenFoundCorrectedMissingNumber() {
        int[] arrayMissingOne = new int[]{1, 3, 4, 5, 6, 7, 8, 9};
        int expectedMissing = 2;
        System.out.println("into the test method");
        MissingNumberXOR numberXOR = new MissingNumberXOR();
        int actualMissing = numberXOR.findXORMissingNumber(arrayMissingOne);
        Assert.assertEquals(expectedMissing, actualMissing);


    }
}