package org.challenges.problems;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLeadNodeInLinkedList {

    public BNode getLeafNodeLinkedList(BNode root) {

        BNode head = null;

        Queue<BNode> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
            while (!queue.isEmpty()) {
                BNode temp = queue.poll();
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }

                if (temp.right == null && temp.left == null) {
                    head = insertIntoList(head, temp);
                }
            }

        }

        return head;

    }

    private BNode insertIntoList(BNode head, BNode temp) {
        if (head == null) {
            head = new BNode(temp.data);
        } else {
            BNode next = getLastNodeInList(head);
            next.right = new BNode(temp.data);
            next.right.left = next;
        }

        return head;
    }

    private BNode getLastNodeInList(BNode head) {
        while (head.right != null) {
            head = head.right;
        }
        return head;
    }

    public static class BNode {

        int data;
        BNode left;
        BNode right;

        public BNode(int data) {
            this.data = data;
        }

    }


}
