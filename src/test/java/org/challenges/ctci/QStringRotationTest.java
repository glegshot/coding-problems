package org.challenges.ctci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class QStringRotationTest {


    QStringRotation qStringRotation;

    @Before
    public void init() {
        qStringRotation = new QStringRotation();
    }


    @Test
    public void isSubStringCheckSolutionOneTest() {
        String value = "waterbottle";
        String subValue = "erbottlewat";
        Assert.assertEquals(true, qStringRotation.isSubStringSolutionOne(value, subValue));
    }

    @Test
    public void rotateStringByOneTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String methodName = "rotateString";
        Method rotateMethod = QStringRotation.class.getDeclaredMethod(methodName, String.class);
        rotateMethod.setAccessible(true);
        String rotatedValue = (String) rotateMethod.invoke(qStringRotation, "rbottlewate");
        Assert.assertEquals("erbottlewat", rotatedValue);
    }


}
