package org.challenges.ctci;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * CTCI question in chapter 1 to find if a string contains unique characters only
 */

public class QisUnique {

    /**
     * hashmap solution for lookup
     * <p>
     * time complexity O(n)
     * space complexity O(n)
     * where n is the length of the string
     *
     * @param value input String type with characters
     * @return boolean
     */
    public boolean hasUniqueSolutionOne(String value) {
        Map<Character, Integer> lookupTable = new HashMap<>();
        for (int i = 0; i < value.length(); i++) {
            if (lookupTable.containsKey(value.charAt(i))) {
                return false;
            }
            lookupTable.put(value.charAt(i), 0);
        }

        return true;
    }

    /**
     * naive brute force solution
     * <p>
     * time complexity O(n*n)
     * space complexity O(1)
     * where n is the length of the string
     *
     * @param value input String type with characters
     * @return boolean
     */
    public boolean hasUniqueSolutionTwo(String value) {

        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < value.length(); j++) {
                if (i == j) {
                    continue;
                } else if (value.charAt(i) == value.charAt(j)) {
                    return false;
                }
            }
        }
        return true;

    }

    /**
     * sorted approach
     * <p>
     * time complexity O(nlogn)
     * space complexity O(n)
     * where n is the length of the string
     *
     * @param value input String type with characters
     * @return boolean
     */
    public boolean hasUniqueSolutionThree(String value){
        char[] valueArray = value.toCharArray();
        Arrays.sort(valueArray);
        for(int i = 0;i<valueArray.length-1;i++){
            if(valueArray[i] == valueArray[i+1]){
                return false;
            }
        }
        return true;

    }


}
