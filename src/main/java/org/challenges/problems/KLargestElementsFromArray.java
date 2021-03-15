package org.challenges.problems;

import java.util.List;

/**
 * finding k largest elements from an array using maxHeap method
 * time complexity O(n + klogn) where n = number of nodes and k = times the extract max is invoked)
 * space complexity O(1)
 * <p>
 * The build heap accepts a List of integers to leverage the implicit resizing of the array
 */

public class KLargestElementsFromArray {

    /**
     * removes the highest element in the heap and invokes heapify to maintina the heap property
     * time complexity O(log n)
     * space complexity O(1)
     *
     * @param maxHeap
     * @return
     */
    public int extractMax(List<Integer> maxHeap) {
        int maxValue = maxHeap.get(0);

        maxHeap.set(0, maxHeap.get(maxHeap.size() - 1));
        maxHeapify(maxHeap, 0);
        return maxValue;
    }


    /**
     * this will heapify the current nodes subtree
     * <p>
     * time complexity O(log n) where n is the number of nodes in the subtree
     *
     * @param inputArray
     * @param currentIndex
     */
    private void maxHeapify(List<Integer> inputArray, int currentIndex) {

        int leftIndex = 2 * currentIndex + 1;
        int rightIndex = 2 * currentIndex + 2;

        int maxIndex = currentIndex;
        if (leftIndex < inputArray.size() && inputArray.get(leftIndex) > inputArray.get(maxIndex)) {
            maxIndex = leftIndex;
        }
        if (rightIndex < inputArray.size() && inputArray.get(rightIndex) > inputArray.get(maxIndex)) {
            maxIndex = rightIndex;
        }

        if (maxIndex != currentIndex) {
            int temp = inputArray.get(currentIndex);
            inputArray.set(currentIndex, inputArray.get(maxIndex));
            inputArray.set(maxIndex, temp);
            maxHeapify(inputArray, maxIndex);
        }

    }

    /**
     * build heap will execute a loop for n/2 times to heapify all the internal nodes(leaf nodes(n/2 in total) are excluded hence n/2)
     * for each of the internal node the max heapify process is performed recursively from the node to the leaf
     * <p>
     * time complexity O(n)
     * space comlexity O(1)
     *
     * @param inputArray
     * @return List<Integer> heapified array
     */
    public List<Integer> buildMapHeap(List<Integer> inputArray) {

        int n = inputArray.size();

        for (int i = n / 2; i >= 0; i--) {
            maxHeapify(inputArray, i);
        }

        return inputArray;

    }


}
