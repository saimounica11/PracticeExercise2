package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial test;
    @Before
    public void setUp(){
        test=new Factorial();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void testfindfactorial(){
        long result=test.findFactorial(20);
        assertEquals(2432902008176640000L,result);
    }
    @Test
    public void testFindfactorialFailure(){
        long result=test.findFactorial(-5);
        assertEquals(-120,result);
    }

}