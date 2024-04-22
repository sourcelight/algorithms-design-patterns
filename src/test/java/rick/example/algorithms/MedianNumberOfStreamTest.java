package rick.example.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianNumberOfStreamTest {

    MedianNumberOfStream medianNumberOfStream;
    @BeforeEach
    void setUp() {
        medianNumberOfStream = new MedianNumberOfStream();
        medianNumberOfStream.insertNum(6);
        medianNumberOfStream.insertNum(3);
        medianNumberOfStream.insertNum(5);
        medianNumberOfStream.insertNum(4);
    }

    @Test
    void test_givenEvenNumber_whenMedianCalculated_thenAverageCentralNumbers() {
        float expected = 4.5f;

        Assert.assertEquals(expected,medianNumberOfStream.findMedian(),0.0);
    }

    @Test
    void test_givenOddNumber_whenMedianCalculated_thenAverageCentralNumbers() {

        float expected = 5f;
        medianNumberOfStream.insertNum(7);
        Assert.assertEquals(expected,medianNumberOfStream.findMedian(),0.0);
    }
}