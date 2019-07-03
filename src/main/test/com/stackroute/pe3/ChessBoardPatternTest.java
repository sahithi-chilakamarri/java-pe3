package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe3.ChessBoardPattern.chessBoardPattern;
import static org.junit.Assert.*;

public class ChessBoardPatternTest {
    public ChessBoardPattern matrix;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        matrix=new ChessBoardPattern();

    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        matrix=null;
    }
    @Test
    public void givenMultiDimenasionalArrayShouldReturnChessPattern(){
        //arrange
        //act
        String str= chessBoardPattern(8,8);
        //assert
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
        //arrange
        //act
        String str= chessBoardPattern(8,7);
        //assert
        assertEquals("error",str);
    }
    @Test
    public void givenRowAndColumnAreZeroShouldReturnError(){
        //arrange
        //act
        String str= chessBoardPattern(0,7);
        //assert
        assertEquals("error",str);
    }
}