package rick.example.algorithms.tree.dfs;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rick.example.algorithms.tree.TreeNode;

class SumOfAllNodesTest {
    TreeNode treeNode;

    @BeforeEach
    void setUp() {
        treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(5);
        treeNode.left.left = new TreeNode(6);
        treeNode.left.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(9);


    }

    @Test
    void findSumOfNodes() {

        int expected = 34;
        SumOfAllNodes sum = new SumOfAllNodes();
        int actual = sum.findSumOfNodes(treeNode);
        Assert.assertEquals(expected, actual);
    }
}