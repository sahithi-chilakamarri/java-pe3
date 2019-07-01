package com.stackroute.pe3;

public class UserDefinedException extends Throwable {
    public UserDefinedException(String str) {
    }
    public static String main(String s) {
        if(s==null)
            return "Error";
        try {
            throw new UserDefinedException(s);
        }
        catch(Exception e) {
                s=s;
            System.out.println(s);
        throw new UserDefinedException(s);
            }
        finally {
            s=s+" This is finally clause.";
        return s;
        }

    }
}

