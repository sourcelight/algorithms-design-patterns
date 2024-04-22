package rick.example.algorithms.tree.dfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rick.example.algorithms.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchSumRootTooLeafTest {

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
    void test_givenTreeNode_whenInputSumPresent_ThenReturnTrue() {
        int sum = 13;
        DepthFirstSearchSumRootTooLeaf sumRootTooLeaf = new DepthFirstSearchSumRootTooLeaf();
        boolean actual = sumRootTooLeaf.searchSumRootToLeaf(treeNode,sum);
        assertEquals(true,actual);
    }


    @Test
    void test_givenTreeNode_whenInputSumNotPresent_ThenReturnFalse() {
        int sum = 4;
        DepthFirstSearchSumRootTooLeaf sumRootTooLeaf = new DepthFirstSearchSumRootTooLeaf();
        boolean actual = sumRootTooLeaf.searchSumRootToLeaf(treeNode,sum);
        assertNotEquals(true,actual);

    }
}