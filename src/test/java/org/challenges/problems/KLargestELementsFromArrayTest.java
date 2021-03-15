package org.challenges.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KLargestELementsFromArrayTest {

    KLargestElementsFromArray kLargestElementsFromArray;

    @Before
    public void init(){
        kLargestElementsFromArray = new KLargestElementsFromArray();
    }

    @Test
    public void getKMaxElementsTest(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(23);
        inputList.add(12);
        inputList.add(9);
        inputList.add(30);
        inputList.add(2);
        inputList.add(50);

        List<Integer> output = new ArrayList<>();
        int k = 3;

        kLargestElementsFromArray.buildMapHeap(inputList);

        for(int i = 0;i<k;i++){
            output.add(kLargestElementsFromArray.extractMax(inputList));
        }

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(50);
        expectedResult.add(30);
        expectedResult.add(23);

        Assert.assertTrue(output.equals(expectedResult));

    }

}
