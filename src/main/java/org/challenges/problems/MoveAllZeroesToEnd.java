package org.challenges.problems;

import java.util.LinkedList;
import java.util.Queue;

public class MoveAllZeroesToEnd {

    /**
     * this solution makes use of a queue to maintain all the zeroes index to swap with
     * <p>
     * time complexity O(n) where n is the number of elements in the array
     * space complexity O(m) where m is the number of zeroes in the array
     *
     * @param inputArray
     * @return int[] filtered array with all zeroes moved to right
     */
    public int[] moveAllZeroesToEnd(int[] inputArray) {

        Queue<Integer> zeroIndiceQueue = new LinkedList<>();


        for (int iteratorIndice = 0; iteratorIndice < inputArray.length; iteratorIndice++) {
            if (inputArray[iteratorIndice] == 0) {
                zeroIndiceQueue.add(iteratorIndice);
            } else {
                Integer zeroIndex = zeroIndiceQueue.poll();
                if (zeroIndex != null) {
                    int temp = inputArray[iteratorIndice];
                    inputArray[iteratorIndice] = inputArray[zeroIndex];
                    inputArray[zeroIndex] = temp;

                    zeroIndiceQueue.add(iteratorIndice);
                    inputArray[iteratorIndice] = 0;
                }
            }
        }

        return inputArray;

    }

    /**
     *
     *
     * @param inputArray
     */
    public int[] moveAllZeroesToEndWithoutExtraSpace(int[] inputArray){
        int count = 0;

        for(int i = 0;i< inputArray.length;i++){

            if(inputArray[i] != 0){
                inputArray[count] = inputArray[i];
                count++;
            }

        }

        int i = inputArray.length - 1 ;
        while(count > 0){
            inputArray[i] = 0;
            i--;
            count--;
        }

        return inputArray;

    }

}
