package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatricesTest {
    AdditionOfMatrices sumOfMatrices;
    int[][] expectedResult;
    int[][] actualResult;
    @Before
    public void setUp(){

        sumOfMatrices=new AdditionOfMatrices();
    }
    @Test
    public void returnTheSumOfTwoGivenMatrices() {
        int[][] matrix1 = {{1, 2,}, {3, 4}, {5, 6}};
        int[][] matrix2 = {{9, 8,}, {7, 6}, {5, 4}};
        int[][] result = {{10, 10}, {10, 10}, {10, 10}};

        actualResult = sumOfMatrices.additionOfTwoMatrices(3, 2, matrix1, matrix2);
        expectedResult = result;
        assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void checkTheSumOfTwoGivenMatrices() {
        int[][] matrix1 = {{-3, 2,}, {3, 6}, {1, 6}};
        int[][] matrix2 = {{9, 5,}, {-1, 6}, {3, 4}};
        int[][] result = {{6,7}, {2, 12}, {4, 10}};

        actualResult = sumOfMatrices.additionOfTwoMatrices(3, 2, matrix1, matrix2);
        expectedResult = result;
        assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void checkTheSumOfTwoMatrices() {
        int[][] matrix1 = {{-3, 2,}, {3, 6}, {1, 6}};
        int[][] matrix2 = {{9, 5,}, {-1, 6}, {3, 4}};
        int[][] result = {{9,7}, {2, 5}, {4, 10}};

        actualResult = sumOfMatrices.additionOfTwoMatrices(3, 2, matrix1, matrix2);
        expectedResult = result;
        assertNotEquals(expectedResult, actualResult);
    }
    @After
    public void tearDown()
    {
        sumOfMatrices=null;
    }


}