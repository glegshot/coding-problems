package org.challenges.ctci;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QisUniqueTest {

    QisUnique qisUnique;

    @Before
    public void init() {
        this.qisUnique = new QisUnique();
    }

    @After
    public void clean() {
        this.qisUnique = null;
    }

    @Test
    public void checkIfStringContainsUniqueSolutionWithHashMapReturnFalseTest() {
        String value = "abcsda";
        Assert.assertEquals(false, qisUnique.hasUniqueSolutionOne(value));
    }

    @Test
    public void checkIfStringContainsUniqueSolutionWithHashMapReturnTrueTest() {
        String value = "abcsd";
        Assert.assertEquals(true, qisUnique.hasUniqueSolutionOne(value));
    }


    @Test
    public void checkIfStringContainsUniqueBruteForceSolutionReturnTrueTest() {
        String value = "abcsd";
        Assert.assertEquals(true, qisUnique.hasUniqueSolutionTwo(value));
    }

    @Test
    public void checkIfStringContainsUniqueBruteForceSolutionReturnFalseTest() {
        String value = "abcsdd";
        Assert.assertEquals(false, qisUnique.hasUniqueSolutionTwo(value));
    }

    @Test
    public void checkIfStringContainsUniqueSortedSolutionReturnTrueTest() {
        String value = "abcsd";
        Assert.assertEquals(true, qisUnique.hasUniqueSolutionThree(value));
    }

    @Test
    public void checkIfStringContainsUniqueSortedSolutionReturnFalseTest() {
        String value = "abcsdd";
        Assert.assertEquals(false, qisUnique.hasUniqueSolutionThree(value));
    }


}
