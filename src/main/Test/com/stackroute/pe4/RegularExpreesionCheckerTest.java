package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpreesionCheckerTest {
RegularExpreesionChecker re;
    @Before
    public void setUp() throws Exception {
        re=new RegularExpreesionChecker();
    }

    @After
    public void tearDown() throws Exception {
        re=null;
    }
    @Test
    public void givenStringShouldReturnPresence(){
        boolean result=re.harryPresence("my name is harry");
        assertEquals(true,result);
    }
    @Test
    public void givenStringShouldReturnPresences(){
        boolean result=re.harryPresence("my name is HARRY");
        assertEquals(true,result);
    }
}