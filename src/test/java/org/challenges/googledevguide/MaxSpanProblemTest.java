package org.challenges.googledevguide;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MaxSpanProblemTest {

    @Test
    public void maxSpanNaiveTest() {

        MaxSpanProblem maxSpanProblem = new MaxSpanProblem();
        Assert.assertEquals(4, maxSpanProblem.maxSpanNaive(new int[]{1, 2, 1, 1, 3}));

    }

    @Test
    public void maxSpanLinearTest1() {

        MaxSpanProblem maxSpanProblem = new MaxSpanProblem();
        Assert.assertEquals(4, maxSpanProblem.maxSpanLinear(new int[]{1, 2, 1, 1, 3}));

    }

    @Test
    public void maxSpanNaiveLinearTest2() {

        MaxSpanProblem maxSpanProblem = new MaxSpanProblem();
        Assert.assertEquals(6, maxSpanProblem.maxSpanLinear(new int[]{1, 4, 2, 1, 4, 4, 4}));

    }

}
