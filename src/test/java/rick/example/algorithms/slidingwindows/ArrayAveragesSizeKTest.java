/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.slidingwindows;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayAveragesSizeKTest {



    @Test
    void test_givenArray_whenSetSizeSubArray_thenCalculateAveragesWindows(){

        int k =5;
        int[] arr= new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        double[] expectedAverage= new double []{2.2, 2.8, 2.4, 3.6, 2.8};
        ArrayAveragesSizeK averagesSizeK = new ArrayAveragesSizeK();
        double[] actualAverageArray = averagesSizeK.findAverages( arr, k);
        Assert.assertArrayEquals(expectedAverage,actualAverageArray,0.0000001);

    }


}
