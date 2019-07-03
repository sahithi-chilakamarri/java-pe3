package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FirstAndLastDayOfWeekTest {
public FirstAndLastDayOfWeek date;
    @Before
    public void setUp()
    {
        date=new FirstAndLastDayOfWeek();

    }
    @After
    public void tearDown()
    {
        date=null;
    }
    @Test
    public void givenDateShouldReturnFirstAndLastDateOfTheWeek(){
        //arrange
        //act
        FirstAndLastDayOfWeek result =date.week();
        //assert
        assertEquals("Mon 01/07/2019",result.firstDay);
        assertEquals("Sun 07/07/2019",result.lastDay);

    }
}