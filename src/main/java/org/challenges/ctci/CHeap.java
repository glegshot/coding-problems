package org.challenges.ctci;

public class CHeap {

    int[] valueArray;
    int maxCapacity;
    int currentSize;


    /**
     * max heap conversion of an int array
     * time complexity O(n) where n is the size of the array also the total nodes in the heap
     * space complexity O(1)
     *
     *
     * @param inputArray
     * @return int[] maxheap of inputarray
     */
    public int[] buildMaxHeap(int[] inputArray) {

        //heapfiy each of the subtree with each node as the root index,we start with the last node and goes all
        //the way to the 1st node in the heap
        for (int i = inputArray.length - 1; i >= 0; i--) {
            maxHeapify(inputArray, i, inputArray.length);
        }

        return inputArray;

    }

    private void maxHeapify(int[] inputArray, int rootIndex, int arraySize) {

        //calculating the left and right child index
        int leftChildIndex = (2 * rootIndex) + 1;
        int rightChildIndex = (2 * rootIndex) + 2;

        //calculate the index with highest value
        int maxIndex = findIndexOfMax(inputArray, rootIndex, leftChildIndex, rightChildIndex);

        //if the max value is not at the root index,then swap is required
        if(maxIndex != rootIndex){
            swapForIndex(inputArray,rootIndex,maxIndex);
            //recursively heapify the remaining subtree with the newly swapped node as the root
            maxHeapify(inputArray, maxIndex, arraySize);
        }

    }

    private void swapForIndex(int[] inputArray, int rootIndex, int maxIndex){
        int temp = inputArray[rootIndex];
        inputArray[rootIndex] = inputArray[maxIndex];
        inputArray[maxIndex] = temp;

    }

    private int findIndexOfMax(int[] inputArray, int rootIndex, int leftChildIndex, int rightChildIndex) {
        int maxIndex = rootIndex;
        if (leftChildIndex < inputArray.length && inputArray[maxIndex] < inputArray[leftChildIndex]) {
            maxIndex = leftChildIndex;
        }
        if (rightChildIndex < inputArray.length && inputArray[maxIndex] < inputArray[rightChildIndex]) {
            maxIndex = rightChildIndex;
        }

        return maxIndex;

    }


}
