package org.challenges.problems;

public class BinaryTreeNodeDeletion {


    int depth = 0;
    BinaryTreeNode n;
    BinaryTreeNode delNode;


    /**
     *
     * method to delete a node value in binary tree
     *
     * time complexity O(n) where n is the number of nodes in the tree
     * space complexity O(1) ;ignoring the call stacks
     *
     * the solution recursively searches the tree for the node with designated delete value and the bottom-right most node
     * and replaced the delete value node with bottom-right most value
     *
     *
     */
    public BinaryTreeNode deleteNode(BinaryTreeNode root, int deleteValue) {
        n = root;
        delNode = root;
        if(root == null){
            return null;
        }
        findNodes(root, deleteValue, 0);
        if(delNode == root){
            return null;
        }

        if (n.rightChild != null) {
            delNode.data = n.rightChild.data;
            n.rightChild = null;
        } else if (n.leftChild != null) {
            delNode.data = n.leftChild.data;
            n.leftChild = null;
        }

        return root;

    }

    public void findNodes(BinaryTreeNode root, int deleteValue, int count) {
        if(root == null){
            return;
        }

        if ((root.rightChild != null) && (root.rightChild.data == deleteValue)) {
            this.delNode = root.rightChild;
        } else if ((root.leftChild != null) && (root.leftChild.data == deleteValue)) {
            this.delNode = root.leftChild;
        }

        if (root.rightChild != null) {
            if (count > this.depth) {
                this.depth = count;
                this.n = root;
            }
            findNodes(root.rightChild, deleteValue, count + 1);

        }
        if (root.leftChild != null) {
            if (count > this.depth) {
                this.depth = count;
                this.n = root;
            }
            findNodes(root.leftChild, deleteValue, count + 1);

        }

    }


    public static class BinaryTreeNode {

        int data;
        BinaryTreeNode leftChild;
        BinaryTreeNode rightChild;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }


}
