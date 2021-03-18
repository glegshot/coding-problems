package org.challenges.ctci;

/**
 * Singly Linked List Implementation
 * The implementation includes add,get,remove operations
 */
public class CLinkedList<T> {

    private Node<T> head;
    private int listSize;

    public CLinkedList(T value) {
        this.head = new Node<>(value);
        this.listSize += 1;
    }

    /**
     * add method to insert a value to end of the list
     * <p>
     * time complexity O(n) where n is the length of the list
     *
     * @param value
     */
    public void add(T value) {
        Node n = this.head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(value);
        this.listSize += 1;
    }

    /**
     * get method to get the value at a particular position starting with index 0
     * <p>
     * time complexity O(n) where n is length of the list
     * if the value not present in the list then it will iterate for the n nodes and return a null
     *
     * @param index
     * @return
     */
    public T get(int index) {
        int counter = 0;
        Node n = this.head;
        while (n != null && counter < index) {
            n = n.next;
            if (counter == index) {
                return (T) n.value;
            }
            counter++;
        }

        return null;

    }

    /**
     * remove operation to remove a value
     * <p>
     * time complexity is O(n) where n is lenght of the list
     * <p>
     * if the item not present then returns a null
     *
     * @param value
     * @return T removed node value
     */
    public T remove(T value) {
        Node n = this.head;
        T v = null;
        if (n.value == value) {
            v = (T) n.value;
        }

        while (n.next != null) {
            if (n.next.value == value) {
                v = (T) n.next.value;
                n.next = n.next.next;
            }
        }
        return v;
    }

    public Node<T> getHead() {
        return head;
    }

    public int getListSize() {
        return listSize;
    }

    private static class Node<T> {

        T value;
        Node next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

    }

}
