package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe3.MatrixAddition.add;
import static org.junit.Assert.*;

public class MatrixAdditionTest {
    public MatrixAddition matrix;
    @Before
    public void setUp()
    {
        matrix=new MatrixAddition();

    }
    @After
    public void tearDown()
    {
        matrix=null;
    }
    @Test
    public void givenTwoMatricesShouldReturnTheirAddition(){
        //arrange
        int[][] matrix1={{5,6},{5,6}};
        int[][] matrix2={{5,6},{5,6}};
        //act
        String result=add(2,2,matrix1,matrix2);
        //assert
        assertEquals("10 12 10 12 ",result);
    }
    @Test
    public void givenTwoMatricesOfNegativeSizeShouldReturnError(){
        //arrange
        int[][] matrix1={{5,6,7},{5,6,7}};
        int[][] matrix2={{5,6,7},{5,6,7}};
        //act
        String result=add(-5,3,matrix1,matrix2);
        //assert
        assertEquals("Error",result);
    }
    @Test
    public void givenTwoMatricesWithDifferentSizesShouldReturnSum(){
        //arrange
        int[][] matrix1={{5,6},{5,6},{5,6}};
        int[][] matrix2={{5,6},{5,6},{5,6}};
        //act
        String result=add(3,2,matrix1,matrix2);
        //assert
        assertEquals("10 12 10 12 10 12 ",result);
    }

}