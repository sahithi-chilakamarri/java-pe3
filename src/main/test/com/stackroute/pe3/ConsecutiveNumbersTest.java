package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    public ConsecutiveNumbers numbers;
    @Before
    public void setUp()
    {
        numbers=new ConsecutiveNumbers();
    }
    @After
    public void tearDown()
    {
        numbers=null;
    }
    @Test
    public void givenConsecutiveNumbersShouldReturnConsecutive()
    {
        //arrange
//act
        String result=numbers.consecutive("23 24 25 26 27 28 29");
//assert
        assertEquals("consecutive numbers",result);
    }
    @Test
    public void givenConsecutiveNumbersInDecreasingOrderShouldReturnConsecutive()
    {
        //arrange
//act
        String result=numbers.consecutive("65 64 63 62 61 60 59");
//assert
        assertEquals("consecutive numbers",result);
    }

    @Test
    public void givenConsecutiveNumbersShouldReturnNonConsecutive()
    {
        //arrange
//act
        String result=numbers.consecutive("4 6 7 3 2 8 7");
//assert
        assertEquals("non consecutive numbers",result);
    }
    @Test
    public void givenEmptyStringShouldReturnError()
    {
        //arrange
//act
        String result=numbers.consecutive(" ");
//assert
        assertEquals("Error",result);
    }

}