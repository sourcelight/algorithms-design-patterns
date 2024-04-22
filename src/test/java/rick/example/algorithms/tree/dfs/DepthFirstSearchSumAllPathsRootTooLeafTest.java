package rick.example.algorithms.tree.dfs;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rick.example.algorithms.tree.TreeNode;

import java.util.Arrays;
import java.util.List;

class DepthFirstSearchSumAllPathsRootTooLeafTest {


    TreeNode treeNode;

    @BeforeEach
    void setUp() {

        treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(9);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.left.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.right.left = new TreeNode(4);


    }

    @Test
    void test_givenTreeNode_whenSumFound_thenExpectedAllCorrectPaths() {
        DepthFirstSearchSumAllPathsRootTooLeaf sumRootTooLeaf = new DepthFirstSearchSumAllPathsRootTooLeaf();
        int sum = 12;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1,2,9),Arrays.asList(1,3,4,4));
        List<List<Integer>> actualPaths = sumRootTooLeaf.findAllPaths(treeNode, sum);
        Assert.assertEquals(expected, actualPaths);
        //Assert.assertEquals(actualPaths.get(0), expected.get(0));
        //Assert.assertEquals(actualPaths.get(1), expected.get(1));
    }
}