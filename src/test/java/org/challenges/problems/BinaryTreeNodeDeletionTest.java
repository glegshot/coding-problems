package org.challenges.problems;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@RunWith(JUnit4.class)
public class BinaryTreeNodeDeletionTest {

    @Test
    public void simpleBinaryTreeDeletionTest() {

        BinaryTreeNodeDeletion.BinaryTreeNode root = new BinaryTreeNodeDeletion.BinaryTreeNode(10);
        BinaryTreeNodeDeletion.BinaryTreeNode leftOne = new BinaryTreeNodeDeletion.BinaryTreeNode(20);
        BinaryTreeNodeDeletion.BinaryTreeNode rightOne = new BinaryTreeNodeDeletion.BinaryTreeNode(30);
        root.leftChild = leftOne;
        root.rightChild = rightOne;

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(30);
        expectedList.add(20);
        expectedList.add(null);
        expectedList.add(null);
        expectedList.add(null);

        BinaryTreeNodeDeletion binaryTreeNodeDeletion = new BinaryTreeNodeDeletion();
        Assert.assertNotNull(binaryTreeNodeDeletion.deleteNode(root, 10));

        Assert.assertTrue(expectedList.equals(generateResult(root)));

    }

    @Test
    public void emptyBinaryTreeDeletionTest() {

        BinaryTreeNodeDeletion.BinaryTreeNode root = null;

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(null);

        BinaryTreeNodeDeletion binaryTreeNodeDeletion = new BinaryTreeNodeDeletion();
        Assert.assertNull(binaryTreeNodeDeletion.deleteNode(root, 10));

        Assert.assertTrue(expectedList.equals(generateResult(root)));

    }


    @Test
    public void SecondExampleBinaryTreeDeletionTest() {

        BinaryTreeNodeDeletion.BinaryTreeNode root = new BinaryTreeNodeDeletion.BinaryTreeNode(10);
        BinaryTreeNodeDeletion.BinaryTreeNode leftOne = new BinaryTreeNodeDeletion.BinaryTreeNode(20);
        BinaryTreeNodeDeletion.BinaryTreeNode rightOne = new BinaryTreeNodeDeletion.BinaryTreeNode(40);
        BinaryTreeNodeDeletion.BinaryTreeNode leftTwo = new BinaryTreeNodeDeletion.BinaryTreeNode(60);
        BinaryTreeNodeDeletion.BinaryTreeNode leftThree = new BinaryTreeNodeDeletion.BinaryTreeNode(70);
        BinaryTreeNodeDeletion.BinaryTreeNode rightThree = new BinaryTreeNodeDeletion.BinaryTreeNode(100);
        BinaryTreeNodeDeletion.BinaryTreeNode leftFour = new BinaryTreeNodeDeletion.BinaryTreeNode(25);

        root.leftChild = leftOne;
        root.rightChild = rightOne;
        root.leftChild.leftChild = leftTwo;
        root.leftChild.leftChild.leftChild = leftThree;
        root.leftChild.leftChild.rightChild = rightThree;
        root.leftChild.leftChild.leftChild.leftChild = leftFour;

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(10);
        expectedList.add(25);
        expectedList.add(40);
        expectedList.add(60);
        expectedList.add(null);
        expectedList.add(null);
        expectedList.add(null);
        expectedList.add(70);
        expectedList.add(100);
        expectedList.add(null);
        expectedList.add(null);
        expectedList.add(null);
        expectedList.add(null);

        BinaryTreeNodeDeletion binaryTreeNodeDeletion = new BinaryTreeNodeDeletion();
        Assert.assertNotNull(binaryTreeNodeDeletion.deleteNode(root, 20));


        Assert.assertTrue(expectedList.equals(generateResult(root)));

    }


    /**
     * this method will generate a perfect binary tree list
     *
     * @param root
     * @return
     */
    public List<Integer> generateResult(BinaryTreeNodeDeletion.BinaryTreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        Queue<BinaryTreeNodeDeletion.BinaryTreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNodeDeletion.BinaryTreeNode node = queue.poll();
            if (node != null) {
                queue.add(node.leftChild);
                queue.add(node.rightChild);
                resultList.add(node.data);
            } else {
                resultList.add(null);
            }

        }

        return resultList;
    }


}
