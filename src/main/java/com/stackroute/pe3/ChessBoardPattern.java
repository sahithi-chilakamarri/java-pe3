package com.stackroute.pe3;
//This is used to create the chessboard pattern.
public class ChessBoardPattern {
    public static String chessBoardPattern(int row, int column)
    {
        int[][] array;
        String string="";
        if(row!=column)
            string="Error";
        else if(row<0 || column<0)
            string="Error";
        //It checks for the even rows and columns create white box else create black box.
        else {
            for (row = 0; row < 8; row++) {
                for (column = 0; column < 8; column++) {
                    if ((row % 2) == (column % 2))
                        string = string + "WW|";
                    else
                        string = string + "BB|";
                }
                string = string + "\n";
            }
        }
        return string;
    }
}

