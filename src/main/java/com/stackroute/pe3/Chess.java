package com.stackroute.pe3;
import java.awt.*;
public class Chess {
    public static String chess(int row,int col)
    {
        int[][] array;
        String str="";
        if(row!=col)
            str="error";
        else if(row<0 || col<0)
            str="error";
        else {
            for (row = 0; row < 8; row++) {
                for (col = 0; col < 8; col++) {
                    if ((row % 2) == (col % 2))
                        str = str + "WW|";
                    else
                        str = str + "BB|";
                }
                str = str + "\n";
            }
        }
        return str;
    }
}

