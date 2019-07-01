package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe3.Chess.chess;
import static org.junit.Assert.*;

public class ChessTest {
    public Chess matrix;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        matrix=new Chess();

    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        matrix=null;
    }
    @Test
    public void givenMultiDimenasionalArrayShouldReturnChessPattern(){
        String str=chess(8,8);
        assertEquals("WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n",str);

    }
    @Test
    public void givenRowNotEqualsToColumnShouldReturnError(){
        String str=chess(8,7);
        assertEquals("error",str);
    }
    @Test
    public void givenRowAndColumAreZeroShouldReturnError(){
        String str=chess(0,7);
        assertEquals("error",str);
    }



}