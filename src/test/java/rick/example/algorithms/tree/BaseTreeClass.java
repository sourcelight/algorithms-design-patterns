/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseTreeClass {

    /**
     * This method get an an array of integres
     * and returns a binary tree node according to the sequence of data
     *
     * @param seqInput
     * @return
     */
    TreeNode createTreeWithSequenceInput(Integer[] seqInput) {
        TreeManager manager = new TreeManager();
        //this list returned is immutable and cannot remove the first element(the root node)
        //List<Integer> list =  Arrays.asList(seqInput);
        List<Integer> list =  new ArrayList<>(Arrays.asList(seqInput));
        //I assume the first element of the list is the root node
        TreeNode root = new TreeNode(list.get(0));
        list.remove(0);
        for (Integer val : list) {
            manager.addRecursive(root, val);
        }
        return root;
    }
}
