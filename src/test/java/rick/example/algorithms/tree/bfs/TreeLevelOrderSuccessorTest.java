package rick.example.algorithms.tree.bfs;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rick.example.algorithms.tree.TreeNode;

class TreeLevelOrderSuccessorTest {

    TreeNode treeNode;


    @BeforeEach
    void setUp() {
        treeNode = new TreeNode(12);
        treeNode.left = new TreeNode(7);
        treeNode.right = new TreeNode(1);
        treeNode.left.left = new TreeNode(9);
        treeNode.right.left = new TreeNode(10);
        treeNode.right.right = new TreeNode(5);


    }

    @Test
    void test_givenTreeNode_whenInputNode_thenGetSuccessorNode() {
        int key = 9;
        TreeNode expectedNode = new TreeNode(10);
        TreeLevelOrderSuccessor treeLevelOrderSuccessor = new TreeLevelOrderSuccessor();
        TreeNode actualNode = treeLevelOrderSuccessor.getSuccessorNode(treeNode, key);
        Assert.assertEquals(expectedNode.getVal(), actualNode.getVal());

    }

    @Test
    void test_givenTreeNode_whenInputNodeWithEvolution_thenGetSuccessorNode() {
        int key = 9;
        TreeNode expectedNode = new TreeNode(10);
        TreeLevelOrderSuccessor treeLevelOrderSuccessor = new TreeLevelOrderSuccessor();
        TreeNode actualNode = treeLevelOrderSuccessor.getSuccessorNodeEvolution(treeNode, key);
        Assert.assertEquals(expectedNode.getVal(), actualNode.getVal());

    }


}