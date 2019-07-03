package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe3.StudentMarks.studentGrades;
import static org.junit.Assert.*;

public class StudentMarksTest {
    public StudentMarks marks;
    @Before
    public void setUp()
    {
        marks=new StudentMarks();

    }
    @After
    public void tearDown()
    {
        marks=null;
    }
    @Test
    public void givenMarksOfStudentReturnGradesAreBelowHundred(){
        //arrange
        //act
        int[] array={65,78,90,89};
        String result=studentGrades(array,4);
        //assert
        assertEquals("Success",result);
    }
    @Test
    public void givenNegativeMarksOfStudentReturnError(){
        //arrange
        //act
        int[] array={-65,-78,190,89};
        String result=studentGrades(array,4);
        //assert
        assertEquals("Error",result);
    }
    @Test
    public void givenWrongArraySizeShouldReturnError(){
        //arrange
        //act
        String result=studentGrades(new int[]{-65,78,90,89},5);
        //assert
        assertEquals("Error",result);
    }

}