/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains a method that returns all distinct subsets
 */
public class FindDifferentSubsets {


    public List<List<Integer>> findAllDistinctSubsets(int[] nums) {
        List<List<Integer>> allSets = new ArrayList<>();
        //add the empty set
        allSets.add(new ArrayList<>());
        for (int currentNum : nums) {
            int size = allSets.size();
            for (int i = 0; i < size; i++) {
                //I recover the previous sets and create(new ArrayList<>) a modify a new one
                List<Integer> set = new ArrayList<>(allSets.get(i));
                //and add the new elment to the previous set
                //for sure they are not duplicated because the input doesn't have data duplication
                set.add(currentNum);
                allSets.add(set);
            }

        }


        return allSets;
    }


}
