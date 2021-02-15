package org.challenege.lambda.practice;

import org.challenges.lambda.practice.SumAndReduce;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class SumAndReduceTest {

    @Test
    public void sumReduceTest(){

        List<Integer> numbers = Arrays.asList(new Integer(20), new Integer(2), new Integer(23));
        Assert.assertEquals(45,SumAndReduce.calculate(numbers));

    }

}
