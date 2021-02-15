package org.challenege.lambda.practice;

import org.challenges.lambda.practice.OldestPerson;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class OldestPersonTest {

    @Test
    public void getOldestPersonSucess() {
        OldestPerson.Person sara = new OldestPerson.Person("Sara", 4);
        OldestPerson.Person viktor = new OldestPerson.Person("Viktor", 40);
        OldestPerson.Person eva = new OldestPerson.Person("Eva", 42);
        List<OldestPerson.Person> collection = Arrays.asList(sara, eva, viktor);
        Assert.assertEquals(eva.getAge(), OldestPerson.getOldestPerson(collection).getAge());
    }

}
