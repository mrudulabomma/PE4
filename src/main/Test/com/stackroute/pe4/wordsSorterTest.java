package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class wordsSorterTest {
    wordsSorter ws;

    @Before
    public void setUp() throws Exception {
        ws=new wordsSorter();
    }

    @After
    public void tearDown() throws Exception {
        ws=null;
    }
    @Test
    public void givenStringShoudReturnSortedListofwords(){
        List<String> result=ws.sortedWordsList("ram goes to school");
        List<String> expected = Arrays.asList("goes", "ram", "school","to");
        assertEquals(expected,result);
    }
    @Test
    public void givenStringShoudReturnSortedListofword(){
        List<String> result=ws.sortedWordsList("Ram goes to scHool");
        List<String> expected = Arrays.asList("goes", "ram", "school","to");
        assertEquals(expected,result);
    }
}