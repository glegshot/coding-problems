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
    public boolean hasUniqueSolutionThree(String value) {
        char[] valueArray = value.toCharArray();
        Arrays.sort(valueArray);
        for (int i = 0; i < valueArray.length - 1; i++) {
            if (valueArray[i] == valueArray[i + 1]) {
                return false;
            }
        }
        return true;

    }

    /**
     * this is bit manipulation approach
     * its assumed that all the character in the string are in the range set a-z(inclusive)
     * <p>
     * we set 1 at each index corresponding to character in alphabet series,ie a will at 0 ,d will be at 4 etc..
     * for each character,we set the bit at corresponding position and and with the bit vector of elements read so far
     * <p>
     * if the bit is set at the vector position then there is a repeated occurence and the bit wise and will give a value more than 0
     * <p>
     * if the bit wise and always give value 0 then we return true indicating no repeated occurence
     *
     * @param value
     * @return boolean
     */
    public boolean hasUniqueSolutionFour(String value) {
        int bitVector = 0;
        for (int i = 0; i < value.length(); i++) {
            int position = value.charAt(i) - 'a';
            //shift 1 to left by position times
            int bit = 1 << position;
            //bitwise and of bit and bitVector to check if the 'bit' at 'position' is already set or not
            if ((bitVector & bit) > 0) {
                return false;
            }
            //set the bit at position in bitVector to mark the character as already visited
            bitVector = bitVector | bit;
        }
        return true;
    }


}
