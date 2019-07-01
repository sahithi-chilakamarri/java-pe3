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
        System.out.println("Before");
        matrix=new MatrixAddition();

    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        matrix=null;
    }
    @Test
    public void givenTwoMatricesShouldReturnTheirAddition(){
        int[][] matrix1={{5,6},{5,6}};
        int[][] matrix2={{5,6},{5,6}};
        String result=add(2,2,matrix1,matrix2);
        assertEquals("10 12 10 12 ",result);
    }
    @Test
    public void givenTwoMatricesOfNegativeSizeShouldReturnError(){
        int[][] matrix1={{5,6,7},{5,6,7}};
        int[][] matrix2={{5,6,7},{5,6,7}};
        String result=add(-5,3,matrix1,matrix2);
        assertEquals("Error",result);
    }
    @Test
    public void givenTwoMatricesWithDifferentSizesShouldReturnSum(){
        int[][] matrix1={{5,6},{5,6},{5,6}};
        int[][] matrix2={{5,6},{5,6},{5,6}};
        String result=add(3,2,matrix1,matrix2);
        assertEquals("10 12 10 12 10 12 ",result);
    }

}