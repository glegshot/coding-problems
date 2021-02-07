package org.challenges.googledevguide;

//https://techdevguide.withgoogle.com/paths/foundational/withoutstring-problem-strings-base-remove-return/#!

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

}
