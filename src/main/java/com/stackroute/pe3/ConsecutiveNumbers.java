package com.stackroute.pe3;
//This is used to check whether the given array is consecutive numbers or not.
public class ConsecutiveNumbers {
    public String consecutive(String numbers)
    {
        String result="";
        //Split the array into individual numbers.
        if(numbers==" "){
            result="Error";
        }
        String[] number=numbers.split(" ");
        int array[]=new int[7];
        //It is splitting the array and converting them to numbers.
        for(int i=0;i<7;i++) {
            array[i] = Integer.valueOf(number[i]);
        }
        if(array[0]+1==array[1]) {
            for (int i = 0; i < 6; i++) {
                if (array[i + 1] != array[i] + 1)
                    result = "Non consecutive numbers";
                else
                    result="consecutive numbers";
            }
        }
        else if(array[0]==array[1]+1) {
            for (int i = 6; i >0; i--) {
                if (array[i - 1] == array[i] + 1)
                    result = "consecutive numbers";
                else
                    result="non consecutive numbers";
            }
        }
        if(result=="")
            result="non consecutive numbers";
        return result;

    }
}
