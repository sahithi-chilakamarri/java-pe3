package com.stackroute.pe3;
//This is used to throw the userdefined exceptions.
public class UserDefinedException {
    public UserDefinedException() {
    }
    public static String main(int number) {
        String message = "";
        try {
            //This is used to print the message.
            message = "Exception raised when the number is less than zero";
            if (number < 10)
            {
                throw new Exception(message);
            }
        }
        //Catches the exception
        catch (Exception e)
        {
            message = "Catch block";
        }
        //Finally block
        finally {
            message = "This is finally block";
        }

        return message;
    }
}

