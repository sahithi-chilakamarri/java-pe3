package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe3.Vowels.removeVowels;
import static org.junit.Assert.*;

public class VowelsTest {
   public Vowels str;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        str=new Vowels();

    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        str=null;
    }
    @Test
    public void givenOneArrayShouldRemoveVowelsInString() {
        String[] array=removeVowels(new String[]{"Shile","Sahithi"});
        assertArrayEquals(new String[]{"Shl","Shth"},array);

    }
    @Test
    public void givenOneNullShouldRemoveVowelsInStringAndReturnNull() {
        String[] array=removeVowels(new String[]{"Shile",null});
        assertArrayEquals(new String[]{"Shl",null},array);

    }
    @Test
    public void givenOnenumberShouldRemoveVowelsInStringAndReturnNumber(){
        String[] array=removeVowels(new String[]{"Shile","1234"});
        assertArrayEquals(new String[]{"Shl","1234"},array);

    }
    @Test
    public void givenNullShouldReturnnull() {
        String[] array=removeVowels(null);
        assertArrayEquals(null,array);

    }


}