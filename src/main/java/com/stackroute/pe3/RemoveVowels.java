package com.stackroute.pe3;
//This is used to check the vowels in the string and remove the vowels from the Sring.
public class RemoveVowels {
    public static String[] removeVowels(String[] places){
        if(places==null)
            return null;
        String[] string={};
     string=new String[places.length];
     int i=0;
     //If the place is null then the string array is also assigned to null.
     for(String place:places){
         if(place==null){
             string[i++]=null;
         }
         //Otherwise replace all the vowels in the string to Empty String.
     else {
             string[i++] = place.replaceAll("[aeiou]", "");
             System.out.println(place);
         }
     }
        return string;
    }
}


