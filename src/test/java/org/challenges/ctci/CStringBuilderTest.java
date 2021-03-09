package org.challenges.ctci;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class CStringBuilderTest {

    CStringBuilder cStringBuilder;

    @Before
    public void init() {
        cStringBuilder = new CStringBuilder();
    }

    @Test
    public void stringBuilderAppendTestSuccessfully() {

        cStringBuilder.append('1');
        cStringBuilder.append('2');
       /* cStringBuilder.toString().codePoints().forEach(System.out::print);
        "12".toString().codePoints().forEach(System.out::print);
        */
        Assert.assertEquals("12", cStringBuilder.toString());

    }


    @Test
    public void stringBuilderIncreaseInSizeAccommodationTest() {

        cStringBuilder.append('1');
        cStringBuilder.append('2');
        cStringBuilder.append('3');
        cStringBuilder.append('4');
        cStringBuilder.append('5');
        cStringBuilder.append('6');
        cStringBuilder.append('7');
        cStringBuilder.append('8');
        cStringBuilder.append('9');
        cStringBuilder.append('1');
        cStringBuilder.append('2');
        cStringBuilder.append('3');
        cStringBuilder.append('4');
        cStringBuilder.append('5');
        cStringBuilder.append('6');
        cStringBuilder.append('7');
        cStringBuilder.append('8');

        Assert.assertEquals("12345678912345678", cStringBuilder.toString());

    }


}
