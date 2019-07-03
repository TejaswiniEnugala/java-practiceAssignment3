package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartAndEndDateOfWeekTest {
    StartAndEndDateOfWeek startAndEndDateOfWeek;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        startAndEndDateOfWeek = new StartAndEndDateOfWeek();
    }

    @Test
    public void checkTheStartAndEndOfWeek()
    {
        actualresult = startAndEndDateOfWeek.firstAndLastDateOfWeek();
        expectedresult = "Sun 07/07/2019";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void findStartAndEndDateOfWeek()
    {
        actualresult = startAndEndDateOfWeek.firstAndLastDateOfWeek();
        expectedresult = "Sun 10/07/2019";
        assertNotEquals(expectedresult,actualresult);
    }
    @After
    public void tearDown(){
        startAndEndDateOfWeek = null;
    }



}