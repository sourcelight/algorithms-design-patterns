/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * this class contains a method that calculates all distinct sets
 * considering possible duplicate data in input.
 * First it orders the input data so that duplicate are consecutives
 * Second in case of duplication we add the elememnt only on the last
 * ceated elements and not on all the previous ones as in the previous
 * exercise, in this case we would have obtained duplicated sets
 */
public class FindDifferentSubsetsWithDuplicates {

    public List<List<Integer>> findDistinctSetsFromInputDataDuplication(int[] nums) {

        List<List<Integer>> allSets = new ArrayList<>();
        // sort the numbers to handle duplicates, so duplicates are consecutive
        Arrays.sort(nums);

        int end = 0;
        //I add always the empty element
        allSets.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int start = 0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end;//this end value is calculated at the previous step still not added the new sets
            }
            end = allSets.size();//this end is bigger and valid for the new iteration
            for (int j = start; j < end ; j++) {
                List<Integer> singleSet = new ArrayList<>(allSets.get(j));
                singleSet.add(nums[i]);
                allSets.add(singleSet);
            }
        }
        return allSets;
    }


}
