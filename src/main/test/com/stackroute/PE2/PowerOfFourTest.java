package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour p;
    @Before
    public void setup(){
        p=new PowerOfFour();
    }
    @After
    public void tearDown(){
        p=null;
    }
    @Test
    public void givenPowerOfFourShouldReturnTrue(){
        String result=p.isPowerOfFour(16);
        assertEquals("true",result);

    }
    @Test
    public void givenNotaPowerOfFourShouldReturnFalse(){
        String result=p.isPowerOfFour(10);
        assertEquals("false",result);
    }
    @Test
    public void givenZeroAsInputShouldReturnFalse() {
        String result = p.isPowerOfFour(0);
        assertEquals("false", result);
    }
    @Test
    public void givenNegativeInputReturnFalse(){
        String result = p.isPowerOfFour(-30);
        assertEquals("false", result);

    }
}