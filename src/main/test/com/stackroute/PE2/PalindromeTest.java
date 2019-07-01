package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome test;

    @org.junit.Before
    public void setUp() throws Exception {
        test=new Palindrome();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        test=null;
    }
    @Test
    public void givenIntShouldReturnMessage(){
        int reverse=test.reverseinput(121);
        assertEquals(121,reverse);
        String result=test.checkInput(121);
        assertEquals("palindrome",result);
    }
    @Test
    public void givenInputReturnMessage(){
        int reverse=test.reverseinput(123);
        assertEquals(321,reverse);
        String result=test.checkInput(321);
        assertEquals("not a palindrome",result);
    }
    @Test
    public void givenInputShouldReturnMessage(){
        int reverse=test.reverseinput(12221);
        assertEquals(12221,reverse);
        String result=test.checkInput(12221);
        assertEquals("palindrome",result);

    }
    @Test
    public void givenSingledigitShouldReturnMessage(){
        int reverse=test.reverseinput(1);
        assertEquals(1,reverse);
        String result=test.checkInput(1);
        assertEquals("palindrome",result);

    }

    }

