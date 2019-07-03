package com.stackroute.pe3;
//This is used to check whether the student grades are between 0 to 100.
public class StudentMarks {
    public static String studentGrades(int[] stuGrades,int numOfStudents) {
        if (numOfStudents != stuGrades.length)
            return "Error";
        int i = 0;
        String string = "";
        //Checking whether the student grades are between 0 to 100.
        for (i = 0; i < numOfStudents; i++) {
            if (stuGrades[i] >= 0 && stuGrades[i] <= 100)
                string = "Success";
            else {
                string = "Error";
                break;
            }
        }
            return string;
        }
    }