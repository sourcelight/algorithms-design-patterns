package rick.example.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FindDifferentSubsetsTest {


    @Test
    void findAllDistinctSubsets() {

        int[] arr = new int[]{1, 3, 5};
        List<List<Integer>> expexted = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(3),
                Arrays.asList(1,3),
                Arrays.asList(5),
                Arrays.asList(1,5),
                Arrays.asList(3,5),
                Arrays.asList(1,3,5));
        FindDifferentSubsets findDifferentSubsets = new FindDifferentSubsets();
        List<List<Integer>> actual = findDifferentSubsets.findAllDistinctSubsets(arr);
        Assert.assertEquals(expexted,actual);


    }
}