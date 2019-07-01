package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks test;
    @Before
    public void setUp(){
        test=new StudentMarks();
    }
    @After
    public void  tearDown(){

        test=null;
    }
    @Test
    public void givenNegativeShouldReturnAvg(){
        float[] result=test.studentData(4,new int[]{-12,87,88,89});
        assertArrayEquals(new float[]{63.0f,-12,89},result,2);
    }
    @Test
    public void givenIntArrayShouldReturnAvg(){
        float[] result=test.studentData(4,new int[]{86,87,88,89});
        assertArrayEquals(new float[]{87.5f,86,89},result,2);

    }




}