package org.challenges.ctci;

public class CHeap {

    int[] maxHeap;
    int maxCapacity;
    int currentSize;

    public CHeap() {
        this.maxCapacity = 10;
        this.maxHeap = new int[this.maxCapacity];
        this.currentSize = 0;
    }

    public CHeap(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.maxHeap = new int[maxCapacity];
        this.currentSize = 0;
    }

    /**
     * heap insertion
     * <p>
     * time compelxity O(logn) where n is the total number of nodes
     * space complexity is O(1)
     * <p>
     * please note that the error handling is not done for heap being full scenario
     *
     * @param key
     */
    public void insert(int key) {

        if (currentSize < maxCapacity) {
            this.maxHeap[currentSize] = key;
            this.currentSize += 1;
        }
        shiftUp();

    }


    private void shiftUp() {
        int currentIndex = this.currentSize - 1;
        while (currentIndex > 0) {
            int parent = (currentIndex - 1) / 2;
            if (maxHeap[currentIndex] > maxHeap[parent]) {
                int temp = maxHeap[currentIndex];
                maxHeap[currentIndex] = maxHeap[parent];
                maxHeap[parent] = temp;
                currentIndex = parent;
            } else {
                break;
            }
        }
    }

    /**
     * extract the max value from the max heap
     * <p>
     * time complexity is O(log n) where n is the number of nodes in the heap
     * space complexity is O(1)
     * <p>
     * please note that the error handling is not done for heap being empty scenario
     *
     * @return int max value from the heap
     */
    public int extractMax() {

        int maxValue = this.maxHeap[0];

        this.maxHeap[0] = this.maxHeap[currentSize-1];
        currentSize -= 1;

        shiftDown();
        return maxValue;

    }

    public void shiftDown() {

        int currentIndex = 0;

        while (currentIndex < currentSize) {
            int left = 2 * currentIndex + 1;
            int right = 2 * currentIndex + 2;
            int max = currentIndex;

            if (left < this.currentSize && (this.maxHeap[left] > this.maxHeap[max])) {
                max = left;
            }
            if (right < this.currentSize && (this.maxHeap[right] > this.maxHeap[max])) {
                max = right;
            }

            if (max != currentIndex) {
                int temp = this.maxHeap[currentIndex];
                this.maxHeap[currentIndex] = this.maxHeap[max];
                this.maxHeap[max] = temp;
                currentIndex = max;
            } else {
                break;
            }
        }

    }

    /**
     * max heap conversion of an int array
     * time complexity O(n) where n is the size of the array also the total nodes in the heap
     * space complexity O(1)
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
        if (maxIndex != rootIndex) {
            swapForIndex(inputArray, rootIndex, maxIndex);
            //recursively heapify the remaining subtree with the newly swapped node as the root
            maxHeapify(inputArray, maxIndex, arraySize);
        }

    }

    private void swapForIndex(int[] inputArray, int rootIndex, int maxIndex) {
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
