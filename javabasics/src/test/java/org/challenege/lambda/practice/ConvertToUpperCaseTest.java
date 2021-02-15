package org.challenege.lambda.practice;


import org.challenges.lambda.practice.ConvertToUpperCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class ConvertToUpperCaseTest {

    @Test
    public void convertToUpperCaseTest(){
        Assert.assertTrue(ConvertToUpperCase.mapToUppercase("aaron", "frank", "william", "gilliam")
                .containsAll(Arrays.asList("AARON", "FRANK", "WILLIAM", "GILLIAM")));
    }

    @Test
    public void convertToUpperCaseShouldFailTest(){
        Assert.assertFalse(ConvertToUpperCase.mapToUppercase("aaron", "frank", "william", "gilliam")
                .contains("aaron"));

    }

}
