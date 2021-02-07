package org.challenges.googledevguide;

import java.util.List;

/**
 * The Challenge
 * <p>
 * Given a string S and a set of words D, find the longest word in D that is a subsequence of S.
 * <p>
 * Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W, without reordering the remaining characters.
 * <p>
 * Note: D can appear in any format (list, hash table, prefix tree, etc.
 * <p>
 * For example, given the input of S = "abppplee" and D = {"able", "ale", "apple", "bale", "kangaroo"} the correct output would be "apple"
 */

public class LongestSubsequence {

    //we'll start with assuming D as a list
    // this is a O(n*n) time complexity solution
    public String getHighestSubsequence(String S, List<String> D) {

        int max = 0;
        String result = null;
        for (String word : D) {

            int count = 0;
            int i = 0;
            int j = 0;
            int length = word.length();

            while (j < S.length() && i <word.length()) {
                if (word.charAt(i) == S.charAt(j)) {
                    i++;
                    j++;
                    count++;
                } else {
                    j++;
                }
            }

            if (count == length) {
                if (count >= max) {
                    max = count;
                    result = word;
                }
            }

        }

        return result;

    }


}
