package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.junitdemo.Exceptions;

import static org.junit.Assert.*;

public class ExceptionsTest {
    Exceptions exception;
    @Before
    public void setup()
    {
        exception=new Exceptions();
    }
    @Test
    public void checkNullPointerException()
    {
        String result=exception.checkExceptions(" ");
        assertEquals("nullPointerException",result);
    }
    @Test
    public void checkIndexOutOfBoundException()
    {
        String result=exception.checkTheExceptions("11 ");
        assertEquals("index out of bound",result);
    }
    @Test
    public void checkNegativeArrayIndex()
    {
        String result=exception.checkTheExceptions("-2 ");
        assertEquals("negative array size exception",result);
    }
    @Test
    public void validInput()
    {
        String result=exception.checkTheExceptions("2 ");
        assertEquals("valid input",result);
    }
    @After
    public void tearDown()
    {
        exception=null;
    }

}