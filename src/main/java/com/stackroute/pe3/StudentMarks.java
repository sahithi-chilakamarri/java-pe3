package com.stackroute.pe3;

public class StudentMarks {
    public static String studentGrades(int[] stuGrades,int numOfStudents) {
        if (numOfStudents != stuGrades.length)
            return "Error";
        int i = 0;
        String str = "";
        for (i = 0; i < numOfStudents; i++) {
            if (stuGrades[i] >= 0 && stuGrades[i] <= 100)
                str = "Success";
            else {
                str = "Error";
                break;
            }
        }
            return str;
        }
    }