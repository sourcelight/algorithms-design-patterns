/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.tree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import rick.example.algorithms.tree.bfs.TreeLevelOrderTraversal;

import java.util.List;

public class TreeManagerTest extends BaseTreeClass {





    @Test
    void test_givenRootNode_whenNodesAreInserted_thenCheckNodePositions() {
        TreeManager treeManager = new TreeManager();
        TreeLevelOrderTraversal orderTraversal = new TreeLevelOrderTraversal();
        //First
        Integer[] inputNodes = {4, 2, 7, 1, 3};//note I add element 5 later on the binary search(it means ordered) tree node
        Integer[] expectedNodePositions = {4, 2, 7, 1, 3, 5};
        //Second
        //Integer[] inputNodes = {4,2,7,1,3,null,null,null,null,null,null};
        //Integer[] expectedNodePositions = {4,2,7,1,3,5};

        //Third
        //Integer[] inputNodes = {40,20,60,10,30,50,70};
        //Integer[] expectedNodePositions = {40,20,60,10,30,50,70,null,null,25};

        //I build the tree binary tree according to the input pattern
        TreeNode rootNodeTree = createTreeWithSequenceInput(inputNodes);
        //I add an element in the binary tree
        treeManager.addRecursive(rootNodeTree, 5);

        //I extract the values node positions from the left to the right
        List<List<Integer>> lists = orderTraversal.orderTreeOnLevelSize(rootNodeTree);
        //I flat the list of  lists and convert to an array
        Integer[] actualNodePositions = lists.stream()
                .flatMap(list -> list.stream()).toList()
                .toArray(new Integer[0]);
        Assert.assertEquals(expectedNodePositions, actualNodePositions);

    }


    @Test
    void test_givenNodeTree_whenNodeValuePresent_thenReturnTrue() {
        TreeManager treeManager = new TreeManager();
        Integer[] inputNodes = {4, 2, 7, 1, 3};//note I add element 5 later on the binary search(it means ordered) tree node
         //I build the tree binary tree according to the input pattern
        TreeNode rootNodeTree = createTreeWithSequenceInput(inputNodes);
        treeManager.addRecursive(rootNodeTree, 9);
        boolean nodePresent = treeManager.containsNodeValueRecursive(rootNodeTree, 9);
        Assert.assertEquals(true, nodePresent);

    }


    @Test
    void test_givenNodeTree_whenNodeValueNotPresent_thenReturnFalse() {
        TreeManager treeManager = new TreeManager();
        Integer[] inputNodes = {4, 2, 7, 1, 3};//note I add element 5 later on the binary search(it means ordered) tree node
        //I build the tree binary tree according to the input pattern
        TreeNode rootNodeTree = createTreeWithSequenceInput(inputNodes);
        treeManager.addRecursive(rootNodeTree, 9);
        boolean nodePresent = treeManager.containsNodeValueRecursive(rootNodeTree, 5);
        Assert.assertEquals(false, nodePresent);

    }



}
