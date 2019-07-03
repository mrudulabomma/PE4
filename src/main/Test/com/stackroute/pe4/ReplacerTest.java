package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacerTest {
    Replacer r;

    @Before
    public void setUp() throws Exception {
        r=new Replacer();
    }

    @After
    public void tearDown() throws Exception {
        r=null;
    }
    @Test
    public void givenStringShouldReplaceCharacter(){
        String result=r.replaceLetters("daily dry");
        assertEquals("faity fry",result);
    }
    @Test
    public void givenStringShouldReplaceCharacters(){
        String result=r.replaceLetters("DAily dry");
        assertEquals("faity fry",result);
    }
}