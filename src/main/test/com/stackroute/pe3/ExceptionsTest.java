package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.stackroute.pe3.Exceptions.arrayHandling;
import static org.junit.Assert.*;

public class ExceptionsTest {
    public Exceptions exception;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        exception=new Exceptions();

    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        exception=null;
    }
    @Test
    public void givenArraySizeShouldReturnException(){
        int[] array={1,2,3,4,5};
        String result=arrayHandling(-4,array,exception);
        assertEquals("This is NegativeArraySizeException",result);
    }
    @Test
    public void givenArraySizeShouldReturnIndexException(){
        int[] array={1,2,3,4,5};
        String result=arrayHandling(3,array,exception);
        assertEquals("This is IndexOutOfBoundsException",result);
    }
    @Test
    public void givenArraySizeShouldReturnNullException(){
        int[] array={1,2,3,4,5};
        exception=null;
        String result=arrayHandling(5,array,exception);
        assertEquals("This is NullPointerException",result);
    }
    @Test
    public void givenArraySizeShouldNotReturnError(){
        int[] array={1,2,3,4,5};
        String result=arrayHandling(5,array,exception);
        assertEquals("",result);
    }
}