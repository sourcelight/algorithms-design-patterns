package rick.example.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FindDifferentSubsetsWithDuplicatesTest {

    @Test
    void findDistinctSetsFromInputDataDuplication() {

        int[] input = new int[]{1, 3, 3};

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(3),
                Arrays.asList(1, 3),
                Arrays.asList(3, 3),
                Arrays.asList(1, 3, 3)
        );

        FindDifferentSubsetsWithDuplicates subsetsWithDuplicates = new FindDifferentSubsetsWithDuplicates();
        List<List<Integer>> actual = subsetsWithDuplicates.findDistinctSetsFromInputDataDuplication(input);
        Assert.assertEquals(expected, actual);

    }
}