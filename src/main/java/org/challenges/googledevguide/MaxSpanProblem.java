package org.challenges.googledevguide;

//https://techdevguide.withgoogle.com/paths/foundational/withoutstring-problem-strings-base-remove-return/#!

import java.util.HashMap;
import java.util.Map;

/**
 * Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
 * <p>
 * maxSpan([1, 2, 1, 1, 3]) → 4
 * maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
 * maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */

public class MaxSpanProblem {

    //O(n*n) time complexity o(1) space complexity
    public int maxSpanNaive(int[] nums) {
        int max = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {

            for (int j = nums.length - 1; j >= i; j--) {

                if (nums[i] == nums[j]) {
                    max = Math.max(max, (j - i) + 1);
                    break;
                }

            }

        }
        return max;
    }

    // time complextiy o(n) and space complexity o(n)
    public int maxSpanLinear(int[] nums) {
        int max = 0;
        Map<Integer, Node> spanMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (spanMap.containsKey(nums[i])) {
                Node node = spanMap.get(nums[i]);
                node.span = i - node.initialIndex + 1;
                if (node.span >= max) {
                    max = node.span;
                }
                spanMap.put(nums[i], node);
            } else {
                spanMap.put(nums[i], new Node(i,0));
            }
        }

        return max;
    }

    //class stored as value in the map,with initialindex representing the first occurence index and span for the current key so far.
    public static class Node{
        int initialIndex;
        int span;

        public Node(int initialIndex, int span){
            this.initialIndex = initialIndex;
            this.span = span;
        }
    }

}
