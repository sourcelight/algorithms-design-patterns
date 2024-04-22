/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.algorithms.tree.bfs;


import rick.example.algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * This class contain a method that returns an array of arrays,
 * each array containing the value nodes of each level in the tree
 * It uses a queue where to put the nodes of each level in the tree
 */
public class TreeLevelOrderTraversal {

    /**
     * this method returns an array of arrays,
     * each array containing the value nodes of each level in the tree
     * It uses a queue where to put the nodes of each level in the tree
     *
     * @param root
     * @return
     */
    public List<List<Integer>> orderTreeOnLevelSize(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return  result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);//offer method in case of full queue returns false instead of throwing an exception as the add method does
        while (!queue.isEmpty()) {
            // I get the number of nodes in the queue, the first time it'll be only one(the root node)
            //later it depends on how many children I add
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>(levelSize);
            //in this for loop I remove(queue.poll()) as many nodes I've inserted in the following insertions
            for (int i = 0; i < levelSize; i++) {
                TreeNode treeNode = queue.poll();
                levelList.add(treeNode.getVal());

                //now I add in the queue the possible children of the removed(by the poll method) node
                //note that is only left and right because we deal with a binary tree
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            result.add(levelList);
        }


        return result;
    }


}
