package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe3.UserDefinedException.main;
import static org.junit.Assert.*;

public class UserDefinedExceptionTest {
    public UserDefinedException userDefinedException;

    @Before
    public void setUp() {
        userDefinedException = new UserDefinedException();

    }

    @After
    public void tearDown() {
        userDefinedException = null;
    }

    @Test
    public void givenclassShouldThrowException() {
        String result = main(8);
        assertEquals("This is finally block", result);
    }
}


