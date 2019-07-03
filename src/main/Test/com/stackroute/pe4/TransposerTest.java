package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposerTest {
    Transposer t;

    @Before
    public void setUp() throws Exception {
        t=new Transposer();
    }

    @After
    public void tearDown() throws Exception {
        t=null;
    }
    @Test
    public void givenStringShouldReturnTranspose(){
        String result=t.transposeOfString("hello miss mrudu");
        assertEquals("olleh ssim udurm",result);
    }
    @Test
    public void givenStringShouldReturnTransposes(){
        String result=t.transposeOfString("helLo miss mrudu");
        assertEquals("olleh ssim udurm",result);
    }
}