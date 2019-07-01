package com.stackroute.pe3;

import java.lang.reflect.Array;

public class MatrixAddition {

    public static String add(int row, int column, int[][] matrix1, int[][] matrix2){
        String str="";
        if(row<0 || column<0) {
            str = "Error";
        }
        else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    str = str +( matrix1[i][j] + matrix2[i][j] )+ " ";
                }
            }
        }
          return str;
    }
}
