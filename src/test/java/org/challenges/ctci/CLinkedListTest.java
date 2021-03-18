package org.challenges.ctci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CLinkedListTest {

    CLinkedList<Integer> linkedList;

    @Before
    public void init(){
        linkedList = new CLinkedList(92);
    }

    @Test
    public void linkedListInsertTest(){
        linkedList.add(25);
        linkedList.add(12);
        linkedList.add(32);
        Assert.assertEquals(4,linkedList.getListSize());
    }

    @Test
    public void linkedListGetValueTest(){
        int value = linkedList.get(0);
        Assert.assertEquals(92, value);
    }


    @Test
    public void linkedListGetValueNullTest(){
        Integer value = linkedList.get(1);
        Assert.assertEquals(null, value);
    }


    @Test
    public void linkedListRemoveValueTest(){
        Integer value = linkedList.remove(92);
        Assert.assertNotNull(value);

    }

    @Test
    public void linkedListRemoveValueNullTest(){
        Integer value = linkedList.remove(23);
        Assert.assertNull(value);

    }


}
