package org.challenges.problems;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MoveAllZeroesToEndTest {


    @Test
    public void moveAllZeroesToEndTest() {
        MoveAllZeroesToEnd moveAllZeroesToEnd = new MoveAllZeroesToEnd();
        int[] inputArray = new int[]{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        int[] expectedOutput = new int[]{1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0};

        Assert.assertArrayEquals(expectedOutput, moveAllZeroesToEnd.moveAllZeroesToEnd(inputArray));

    }


    @Test
    public void moveAllZeroesToEndSecondDataTest(){
        MoveAllZeroesToEnd moveAllZeroesToEnd = new MoveAllZeroesToEnd();
        int[] inputArray = new int[]{1, 2, 0, 4, 3, 0, 5, 0};
        int[] expectedOutput = new int[]{1, 2, 4, 3, 5, 0, 0, 0};
        Assert.assertArrayEquals(expectedOutput, moveAllZeroesToEnd.moveAllZeroesToEnd(inputArray));
    }

}
