package com.stackroute.junitdemo;//program to add two matrices

public class AdditionOfMatrices {
    public static int[][] additionOfTwoMatrices(int rows, int columns, int[][] matrix1, int[][] matrix2) {
        int[][] sumOfMatrices = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumOfMatrices[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumOfMatrices;
    }
}
