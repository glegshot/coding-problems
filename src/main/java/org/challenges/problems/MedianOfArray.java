package org.challenges.problems;

import java.util.ArrayList;
import java.util.List;

public class MedianOfArray {

    /**
     * Solution with traversing the array n/2 + 1 times to get the median of the array
     * The solution assumes the elements in the array are larger than Integer.MIN_VALUE and no repeated elements
     * <p>
     * time complexity O(n*n)
     * space complexity O(1)
     *
     * @param valueArray
     * @return int[] median values
     */
    public List<Integer> findMedian(@org.jetbrains.annotations.NotNull int[] valueArray) {

        //variable to hold current max value in the iteration
        int max = Integer.MIN_VALUE;

        //variable to hold the previous iteration max value
        int prevMax = Integer.MAX_VALUE;

        int iterationRequired = 0;
        boolean isEven = true;

        List<Integer> median = new ArrayList<>();

        if (valueArray.length % 2 == 0) {
            iterationRequired = valueArray.length/2 + 1;
        } else {
            iterationRequired = valueArray.length/2;
            isEven = false;
        }

        for (int counter = 0; counter < iterationRequired; counter++) {
            max = Integer.MIN_VALUE;
            for (int i = 0; i < valueArray.length; i++) {
                if (valueArray[i] >= max && valueArray[i] < prevMax) {
                    max = valueArray[i];
                }
            }
            if (counter == iterationRequired - 1 && isEven) {
                median.add(max);
            }
            prevMax = max;
        }
        median.add(prevMax);
        return median;
    }

}
