package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurenceCheckerTest {
    MultipleOccurenceChecker mo;

    @Before
    public void setUp() throws Exception {
        mo=new MultipleOccurenceChecker();
    }

    @After
    public void tearDown() throws Exception {
        mo=null;
    }
    @Test
    public void givenStringShouldreturnMultipleoccurrence(){
        String result=mo.check("se","She sells seashells by the seashore");
        String expected="found: 4 - 6found: 10 - 12found: 27 - 29";
        assertEquals(expected,result);
    }
    @Test
    public void givenStringShouldreturnMultipleoccurrences(){
        String result=mo.check("se","She sells seasheLLs by the seashore");
        String expected="found: 4 - 6found: 10 - 12found: 27 - 29";
        assertEquals(expected,result);
    }
}