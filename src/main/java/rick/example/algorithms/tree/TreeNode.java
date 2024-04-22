/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.algorithms.tree;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    int val;

    public TreeNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
