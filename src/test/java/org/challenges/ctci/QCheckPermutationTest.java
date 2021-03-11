package org.challenges.ctci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class QCheckPermutationTest {

    QCheckPermutation qCheckPermutation;

    @Before
    public void init(){
        qCheckPermutation = new QCheckPermutation();
    }

    @Test
    public void checkPermutationHashMapReturnTrueTest(){
        String one = "abcd";
        String two = "dacb";
        Assert.assertEquals(true,qCheckPermutation.checkPermutationHashMapSolution(one,two));
    }

    @Test
    public void checkPermutationHashMapReturnFalseTest(){
        String one = "ab2d";
        String two = "da1b";
        Assert.assertEquals(false,qCheckPermutation.checkPermutationHashMapSolution(one,two));
    }


}
