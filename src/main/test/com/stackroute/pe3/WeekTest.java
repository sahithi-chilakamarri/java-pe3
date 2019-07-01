package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.time.LocalDate;

import static com.stackroute.pe3.Week.Result.*;
import static org.junit.Assert.*;

public class WeekTest {
public Week date;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        date=new Week();

    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        date=null;
    }
    @Test
    public void givenDateShouldReturnFirstAndLastDateOfTheWeek(){
        Week.Result result =date.week();
        assertEquals("Mon 01/07/2019",result.firstDay);
        assertEquals("Sun 07/07/2019",result.lastDay);

    }
}