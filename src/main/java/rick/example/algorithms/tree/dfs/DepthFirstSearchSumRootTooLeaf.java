/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.algorithms.tree.dfs;

import rick.example.algorithms.tree.TreeNode;

public class DepthFirstSearchSumRootTooLeaf {

    public boolean searchSumRootToLeaf(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        //if the node is a leaf and the sum is equal to the value node we got the response
        if (root.left == null && root.right == null && root.getVal() == sum) {
            return true;
        }
        int diff = sum - root.getVal();

        //2 recursive calls to the 2 branches passing the difference between the initial sum and the node value
        //these are in OR condition, it's just enough that one of them is true to return true along all the chain
        return searchSumRootToLeaf(root.left, diff) || searchSumRootToLeaf(root.right, diff);

    }

}
