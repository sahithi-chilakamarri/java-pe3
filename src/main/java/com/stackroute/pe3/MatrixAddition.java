package com.stackroute.pe3;

//This is used to add two matrices

public class MatrixAddition {

    public static String add(int row, int column, int[][] matrix1, int[][] matrix2){
        String string="";
        //If row and colum are negative numbers then return Error message.
        if(row<0 || column<0)
        {
            string = "Error";
        }
        //Otherwise add the two matrices.
        else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    string = string +( matrix1[i][j] + matrix2[i][j] )+ " ";
                }
            }
        }
          return string;
    }
}
