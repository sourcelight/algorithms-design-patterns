/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.tree;

/**
 * this class has methods to create a binary tree
 * and check if a node is contained in the created tree
 *
 * @see <a href="https://leetcode.com/problems/insert-into-a-binary-search-tree/solutions/1683942/well-detailed-explaination-java-c-python-easy-for-mind-to-accept-it/">leetcode reference</a>
 */
public class TreeManager {
    /**
     * insert a node in the tree
     * according the binary tree rule
     *
     * @param rootNode
     * @param val
     * @return
     */
    public TreeNode addRecursive(TreeNode rootNode, Integer val) {
        if (rootNode == null) {
            return new TreeNode(val);
        }
        if (val != null && val < rootNode.getVal()) {
            rootNode.left = addRecursive(rootNode.left, val);
        } else if (val != null && val > rootNode.getVal()) {
            rootNode.right = addRecursive(rootNode.right, val);
        }
        //in the case val== rootNode.getVal() the node with that value is already present
        return rootNode;
    }

    /**
     * check into the binary tree the presence of a node
     * with that values specified in the input
     *
     * @param rootNode
     * @param i
     * @return
     */
    public boolean containsNodeValueRecursive(TreeNode currentNode, int val) {

        if (currentNode == null)
            return false;

        if (currentNode.val == val)
            return true;

        return val < currentNode.getVal() ? containsNodeValueRecursive(currentNode.left, val)
                : containsNodeValueRecursive(currentNode.right, val);

    }
}
