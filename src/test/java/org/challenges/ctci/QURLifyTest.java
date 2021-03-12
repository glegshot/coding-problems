package org.challenges.ctci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QURLifyTest {


    QURLify qurLify;

    @Before
    public void init(){
        qurLify = new QURLify();
    }

    @Test
    public void performURLifyShiftCharacterApproachSuccessfullyDataOneTest(){

        char[] input = new char[]{'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};
        char[] expectedOutput = new char[]{'M','r','%','2','0','J','o','h','n','%','2','0','S','m','i','t','h'};
        int trueLength = 13;

        Assert.assertArrayEquals(expectedOutput,qurLify.performURLifyByShifting(input,trueLength));

    }


    @Test
    public void performURLifyShiftCharacterApproachSuccessfullyDataTwoTest(){

        char[] input = new char[]{' ',' ',' '}; //input string is a single whitespace only,the extra two are provided as per the question to accommodate the encoded values
        char[] expectedOutput = new char[]{'%','2','0'};
        int trueLength = 1;

        Assert.assertArrayEquals(expectedOutput,qurLify.performURLifyByShifting(input,trueLength));

    }


}
