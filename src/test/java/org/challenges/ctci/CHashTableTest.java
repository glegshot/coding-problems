package org.challenges.ctci;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CHashTableTest {

    CHashTable<String,String> cHashTable;

    @Before
    public void init(){
        cHashTable = new CHashTable<>(10);
    }

    @After
    public void cleanUp(){
        cHashTable = null;
    }


    @Test
    public void testCHastTable(){


        cHashTable.insert("hello","12");
        cHashTable.insert("hey there","14");

        Assert.assertEquals("12",cHashTable.get("hello"));
        Assert.assertEquals("14",cHashTable.get("hey there"));

    }


    @Test
    public void testCHastTableNullGet(){

        cHashTable.insert("hello","12");
        cHashTable.insert("hey there","14");

        Assert.assertEquals(null,cHashTable.get("notavailable"));

    }



}
