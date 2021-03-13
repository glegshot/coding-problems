package org.challenges.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class MedianOfArrayTest {

    MedianOfArray medianOfArray;

    @Before
    public void init() {
        medianOfArray = new MedianOfArray();
    }

    @Test
    public void medianOfArrayOfNumbersNaiveApproachTest() {
        List<Integer> expectedMedian = new ArrayList<>();
        expectedMedian.add(8);
        int[] oddArray = new int[]{8, 5, 16, 21, 2, 4, 3};
        List<Integer> actualResult;
        actualResult = medianOfArray.findMedian(oddArray);
        Assert.assertSame(expectedMedian.get(0), actualResult.get(0));
        Assert.assertEquals(1, actualResult.size());

    }

}
