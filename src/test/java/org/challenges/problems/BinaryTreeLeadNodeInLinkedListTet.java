package org.challenges.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BinaryTreeLeadNodeInLinkedListTet {


    @Test
    public void getLinkedListTest(){
        BinaryTreeLeadNodeInLinkedList.BNode root = new BinaryTreeLeadNodeInLinkedList.BNode(10);
        BinaryTreeLeadNodeInLinkedList.BNode leftOne = new BinaryTreeLeadNodeInLinkedList.BNode(12);
        BinaryTreeLeadNodeInLinkedList.BNode rightOne = new BinaryTreeLeadNodeInLinkedList.BNode(14);
        BinaryTreeLeadNodeInLinkedList.BNode leftTwo = new BinaryTreeLeadNodeInLinkedList.BNode(16);
        BinaryTreeLeadNodeInLinkedList.BNode rightTwo = new BinaryTreeLeadNodeInLinkedList.BNode(18);

        root.left = leftOne;
        root.right = rightOne;
        root.left.left = leftTwo;
        root.left.right = rightTwo;

        BinaryTreeLeadNodeInLinkedList.BNode expectedHead = new BinaryTreeLeadNodeInLinkedList.BNode(14);
        expectedHead.right = new BinaryTreeLeadNodeInLinkedList.BNode(16);
        expectedHead.right.right = new BinaryTreeLeadNodeInLinkedList.BNode(18);


        BinaryTreeLeadNodeInLinkedList.BNode head = new BinaryTreeLeadNodeInLinkedList().getLeafNodeLinkedList(root);

        while(head!= null ){
            System.out.println(head.data);
            head = head.right;
        }



    }




}
