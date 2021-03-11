package org.challenges.ctci;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.IntStream;

public class QCheckPermutation {


    /**
     * solution with hashmap to check for permutation of each other
     * time complexity O(2n) ~ O(n) where n = length of first and second string
     * space complexity O(n)
     *
     * @param one
     * @param two
     * @return boolean
     */
    public boolean checkPermutationHashMapSolution(String one, String two) {

        if (one.length() != two.length()) {
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();

        Iterator<Integer> iterator = IntStream.iterate(0, i -> i + 1).limit(one.length()).iterator();


        while (iterator.hasNext()) {
            int i = iterator.next();
            int count = 1;
            char key = one.charAt(i);
            if (countMap.containsKey(key)) {
                count = countMap.get(key) + 1;
            }
            countMap.put(key, count);
        }


        for (int i = 0; i < two.length(); i++) {
            char key = two.charAt(i);
            if (countMap.containsKey(key)) {
                int count = countMap.get(key) - 1;
                if (count < 0) {
                    return false;
                } else {
                    countMap.put(key, count);
                }
            } else {
                return false;
            }
        }


        return true;
    }

}
