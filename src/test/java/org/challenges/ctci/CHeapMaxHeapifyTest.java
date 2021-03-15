package org.challenges.ctci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class CHeapMaxHeapifyTest {

    CHeap cHeap;

    @Before
    public void init() {
        cHeap = new CHeap();
    }

    @Parameterized.Parameters
    public static List<TestData> getTestData(){
        List<TestData> testData = new ArrayList<>();
        testData.add(new TestData(new int[]{5, 26, 81, 2, 6, 8}, new int[]{81, 26, 8, 2, 6, 5}));
        testData.add(new TestData(new int[]{81,8}, new int[]{81,8}));

        return testData;
    }

    @Parameterized.Parameter
    public TestData testData;

    @Test
    public void maxHeapifyArrayTest() {
        Assert.assertArrayEquals(testData.expectedOutput, cHeap.buildMaxHeap(testData.inputArrayList));
    }

    private static class TestData {
        int[] inputArrayList;
        int[] expectedOutput;

        public TestData(int[] inputArrayList, int[] expectedOutput) {
            this.inputArrayList = inputArrayList;
            this.expectedOutput = expectedOutput;
        }

    }


}
