package org.challenges.googledevguide;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MaxSpanProblemTest {

    @Test
    public void maxSpanNaiveTest(){

        MaxSpanProblem maxSpanProblem = new MaxSpanProblem();
        Assert.assertEquals(4,maxSpanProblem.maxSpanNaive(new int[]{1,2,1,1,3}));

    }




}
