/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.algorithms.tree.dfs;

import rick.example.algorithms.tree.TreeNode;

public class SumOfAllNodes {


    public int findSumOfNodes(TreeNode root) {
        return findSumRecursive(root);

    }


    private int findSumRecursive(TreeNode currentNode) {
        if (currentNode == null) {
            return 0;
        }
        return currentNode.getVal()+findSumRecursive(currentNode.left) + findSumRecursive(currentNode.right);
    }


}
