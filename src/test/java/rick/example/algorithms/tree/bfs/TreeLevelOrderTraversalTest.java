package rick.example.algorithms.tree.bfs;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rick.example.algorithms.tree.TreeNode;

import java.util.Arrays;
import java.util.List;

class TreeLevelOrderTraversalTest {
    TreeNode treeNode;

    @BeforeEach
    void setUp() {
        treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.right.right = new TreeNode(5);

    }

    @Test
    void orderTreeOnLevelSize() {

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4),
                Arrays.asList(5)
                );

        TreeLevelOrderTraversal traversal = new TreeLevelOrderTraversal();
        List<List<Integer>> actual = traversal.orderTreeOnLevelSize(treeNode);
        Assert.assertEquals(expected.get(0), actual.get(0));
        Assert.assertEquals(expected.get(1), actual.get(1));
        Assert.assertEquals(expected.get(2), actual.get(2));
        Assert.assertEquals(expected.get(3), actual.get(3));
    }
}