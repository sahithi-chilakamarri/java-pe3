package com.stackroute.pe3;
//This method is used to handle the different exceptions
public class DifferentExceptions {
    public static String exceptionHandling(int size, int[] array, DifferentExceptions e){
        String string="";
        try {
            //Size is less than zero so it throws NegativeArraySizeException.
            if (size < 0) throw new NegativeArraySizeException();
            //Size is less than the length so it throws IndexOutOfBoundsException.
            if(size!=array.length)throw new IndexOutOfBoundsException();
            //If the object is null it throws NullPointerException
            if(e==null)throw new NullPointerException();
        }
        catch(NegativeArraySizeException exception)
        {
            string="This is NegativeArraySizeException";
        }
        catch(IndexOutOfBoundsException exception){
            string="This is IndexOutOfBoundsException";
        }
        catch(NullPointerException exception){
            string="This is NullPointerException";
        }
        return string;
    }
}
