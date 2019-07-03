package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe3.RemoveVowels.removeVowels;
import static org.junit.Assert.*;

public class RemoveVowelsTest {
   public RemoveVowels removeVowels;
    @Before
    public void setUp()
    {
        removeVowels =new RemoveVowels();

    }
    @After
    public void tearDown()
    {
        removeVowels =null;
    }
    @Test
    public void givenOneArrayOfStringsShouldRemoveVowelsInString() {
        //arrange
        //act
        String[] array=removeVowels(new String[]{"Shile","Sahithi"});
        //assert
        assertArrayEquals(new String[]{"Shl","Shth"},array);

    }
    @Test
    public void givenOneNullValueInArrayShouldRemoveVowelsInStringAndReturnNull() {
        //arrange
        //act
        String[] array=removeVowels(new String[]{"Shile",null});
        //assert
        assertArrayEquals(new String[]{"Shl",null},array);

    }
    @Test
    public void givenOnenumberInArrayShouldRemoveVowelsInStringAndReturnNumber(){
        //arrange
        //act
        String[] array=removeVowels(new String[]{"Shile","1234"});
        //assert
        assertArrayEquals(new String[]{"Shl","1234"},array);

    }
    @Test
    public void givenNullShouldReturnnull() {
        //arrange
        //act
        String[] array=removeVowels(null);
        //assert
        assertArrayEquals(null,array);

    }
}