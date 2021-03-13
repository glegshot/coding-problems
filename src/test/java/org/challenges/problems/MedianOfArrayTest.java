package org.challenges.problems;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RunWith(Parameterized.class)
public class MedianOfArrayTest {

    MedianOfArray medianOfArray;

    @Before
    public void init() {
        medianOfArray = new MedianOfArray();
    }

    @Parameter
    public TestData testData;

    @Parameters
    public static List<TestData> getTestData() {
        List<TestData> testData = new ArrayList<>();
        testData.add(new TestData(Arrays.asList(new Integer[]{8, 5, 16, 21, 2, 4, 3}), Arrays.asList(new Integer[]{8})));
        testData.add(new TestData(Arrays.asList(new Integer[]{8, 5, 16, 21, 2, 4}), Arrays.asList(new Integer[]{8, 5})));
        testData.add(new TestData(Arrays.asList(new Integer[]{8}), Arrays.asList(new Integer[]{8})));
        return testData;
    }


    @Test
    public void medianOfArrayOfNumbersNaiveApproachTest() {
        List<Integer> inputArray = testData.inputArrayList;
        List<Integer> expectedResult = testData.expectedOutput;
        List<Integer> actualResult;
        actualResult = medianOfArray.findMedian(inputArray);
        Assert.assertTrue(expectedResult.containsAll(actualResult) && expectedResult.size() == actualResult.size());
    }

    private static class TestData {
        List<Integer> inputArrayList;
        List<Integer> expectedOutput;

        public TestData(List<Integer> inputArrayList, List<Integer> expectedOutput) {
            this.inputArrayList = inputArrayList;
            this.expectedOutput = expectedOutput;
        }

    }

}
