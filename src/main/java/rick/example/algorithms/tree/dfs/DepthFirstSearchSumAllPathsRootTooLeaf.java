/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.algorithms.tree.dfs;

import rick.example.algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearchSumAllPathsRootTooLeaf {

    public List<List<Integer>> findAllPaths(TreeNode root, int sum) {

        List<List<Integer>> allPaths = new ArrayList<>();

        List<Integer> currentPath = new ArrayList<>();

        findAllPathsRecursive(root, sum, allPaths, currentPath);

        return allPaths;

    }

    private void findAllPathsRecursive(TreeNode currentNode, int sum, List<List<Integer>> allPaths, List<Integer> currentPath) {

        if (currentNode == null) {
            return;
        }
        //I add always the current node value(When I back up in the recursion I remove it)
        currentPath.add(currentNode.getVal());

        //This is the leaf that satisfy the condition and I add the current path
        if (currentNode.getVal() == sum && currentNode.left == null && currentNode.right == null) {
            allPaths.add(new ArrayList<>(currentPath));
        }

        //I iterate on the left and right node
        findAllPathsRecursive(currentNode.left, sum - currentNode.getVal(), allPaths, currentPath);
        findAllPathsRecursive(currentNode.right, sum - currentNode.getVal(), allPaths, currentPath);

        //In the way back of recursion because I traverse the tree in his depth(not in breatdh)
        //I need to remove the current node value
        currentPath.remove(currentPath.size() - 1);


    }
}
