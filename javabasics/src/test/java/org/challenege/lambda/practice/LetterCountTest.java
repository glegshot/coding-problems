package org.challenege.lambda.practice;

import org.challenges.lambda.practice.LetterCount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LetterCountTest {

    @Test
    public void letterCountTest(){
        LetterCount letterCount = new LetterCount();
        Assert.assertEquals(letterCount.getLetterCount("william", "jones", "aaron", "seppe", "frank", "gilliam"), 14);
    }

    @Test
    public void letterCountAnotherTest(){
        LetterCount letterCount = new LetterCount();
        Assert.assertEquals(letterCount.getLetterCount("williams","seppe", "frank", "gilliam"), 15);
    }

    @Test
    public void letterCountEmptyInputTest(){
        LetterCount letterCount = new LetterCount();
        Assert.assertEquals(letterCount.getLetterCount(), 0);
    }

}
