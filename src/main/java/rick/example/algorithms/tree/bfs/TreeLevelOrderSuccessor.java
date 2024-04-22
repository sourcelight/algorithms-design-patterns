/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.algorithms.tree.bfs;


import rick.example.algorithms.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * this class contains a method that returns
 * the successor node in the tree after an input node one
 */
public class TreeLevelOrderSuccessor {

    public TreeNode getSuccessorNode(TreeNode root, int key) {

        TreeNode treeNode = null;
        if (root == null)
            return treeNode;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean keyFound = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {

                if (keyFound) {
                    return queue.poll();
                }

                TreeNode node = queue.poll();
                if (node.getVal() == key) {
                    keyFound = true;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

        }


        return treeNode;

    }

    /**
     * It's not necessary keep the level, but just insert in the queue and traverse all the tree
     * so comparing with the previous method I can avoid to cycle in the for loop for the size level array
     *
     * @param root
     * @param key
     * @return
     */
    public TreeNode getSuccessorNodeEvolution(TreeNode root, int key) {

        if (root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

            if (node.getVal() == key) {
                break;
            }
        }
        return queue.peek();
    }


}
