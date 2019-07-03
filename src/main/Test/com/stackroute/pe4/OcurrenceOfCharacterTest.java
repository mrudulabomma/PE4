package com.stackroute.pe4;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class OcurrenceOfCharacterTest {
    OcurrenceOfCharacter oc;

    @org.junit.Before
    public void setUp() throws Exception {
        oc=new OcurrenceOfCharacter();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        oc=null;
    }
    @Test
    public void givenStringShouldReturnOcurrenceOfCharacter(){
        int result=oc.characterCount('a',"Java is java");

        assertEquals(4,result);

    }
}