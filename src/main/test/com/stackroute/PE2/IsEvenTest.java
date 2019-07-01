package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsEvenTest {
    IsEven test;
    @Before
    public void setUp(){
        test=new IsEven();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void GivenIntReturnTrue(){
        boolean result=test.isEven(10);
        assertEquals(true,result);
    }
    @Test
    public void GivenOddIntReturnFalse(){
        boolean result=test.isEven(5);
        assertEquals(false,result);
    }
    @Test
    public void GivenNegativeIntReturnTrue(){
        boolean result =test.isEven(-10);
        assertEquals(true,result);
    }
    @Test
    public void givenZeroReturnTrue(){
        boolean result =test.isEven(0);
        assertEquals(true,result);
    }


}