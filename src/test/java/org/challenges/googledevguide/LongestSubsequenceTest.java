package org.challenges.googledevguide;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class LongestSubsequenceTest {

    @Test
    public void longestSubsquenceTest(){

        List<String> D = new ArrayList<>(Arrays.asList("apple","ale","bale","kangaroo"));
        String S = "abppplee";

        LongestSubsequence longestSubsequence = new LongestSubsequence();
        Assert.assertEquals("apple",longestSubsequence.getHighestSubsequence(S,D));

    }

}
