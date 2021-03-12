package org.challenges.ctci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QStringCompressionTest {

    QStringCompression qStringCompression;

    @Before
    public void init(){
        qStringCompression = new QStringCompression();
    }

    @Test
    public void stringCompressionSolutionOneSetOneTest(){

        String input = "aabccccccaaa";
        Assert.assertEquals("a2b1c6a3",qStringCompression.compressStringSolutionOne(input));

    }


    @Test
    public void stringCompressionSolutionOneSetTwoTest(){

        String input = "abc";
        Assert.assertEquals("abc",qStringCompression.compressStringSolutionOne(input));

    }



}
