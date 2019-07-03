package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.stackroute.pe3.DifferentExceptions.exceptionHandling;
import static org.junit.Assert.*;

public class DifferentExceptionsTest {
    public DifferentExceptions exception;
    @Before
    public void setUp()
    {
        exception=new DifferentExceptions();

    }
    @After
    public void tearDown()
    {
        exception=null;
    }
    @Test
    public void givenArraySizeShouldReturnException(){
        //arrange
        int[] array={1,2,3,4,5};
        //act
        String result= exceptionHandling(-4,array,exception);
        //assert
        assertEquals("This is NegativeArraySizeException",result);
    }
    @Test
    public void givenArraySizeShouldReturnIndexException(){
        //arrange
        int[] array={1,2,3,4,5};
        //act
        String result= exceptionHandling(3,array,exception);
        //assert
        assertEquals("This is IndexOutOfBoundsException",result);
    }
    @Test
    public void givenArraySizeShouldReturnNullException(){
        //arrange
        int[] array={1,2,3,4,5};
        exception=null;
        //act
        String result= exceptionHandling(5,array,exception);
        //assert
        assertEquals("This is NullPointerException",result);
    }
    @Test
    public void givenArraySizeShouldNotReturnError(){
        int[] array={1,2,3,4,5};
        String result= exceptionHandling(5,array,exception);
        assertEquals("",result);
    }
}