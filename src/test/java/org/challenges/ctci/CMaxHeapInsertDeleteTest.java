package org.challenges.ctci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class CMaxHeapInsertDeleteTest {


    CHeap cHeap;

    @Before
    public void init() {
        cHeap = new CHeap();
    }

    @Test
    public void maxHeapInsertTest() {

        CHeap cHeap = new CHeap(10);
        cHeap.insert(10);
        cHeap.insert(25);
        cHeap.insert(30);
        cHeap.insert(5);
        cHeap.insert(60);

        int[] maxHeap = new int[5];

        for (int index = 0; index < maxHeap.length; index++) {
            maxHeap[index] = cHeap.maxHeap[index];
        }


        Assert.assertEquals(5, cHeap.currentSize);
        Assert.assertArrayEquals(new int[]{60, 30, 25, 5, 10}, maxHeap);

    }

    @Test
    public void maxHeapDeleteTest() {

        CHeap cHeap = new CHeap(10);
        cHeap.maxHeap = new int[]{100, 30, 60, 5, 10, 25};
        cHeap.currentSize = 6;

        Assert.assertEquals(100, cHeap.extractMax());

        int[] maxHeap = new int[5];

        for (int index = 0; index < maxHeap.length; index++) {
            maxHeap[index] = cHeap.maxHeap[index];
        }

        Assert.assertArrayEquals(new int[]{60, 30, 25, 5, 10}, maxHeap);
        Assert.assertEquals(5, cHeap.currentSize);


    }


}
