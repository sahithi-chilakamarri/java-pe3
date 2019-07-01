package com.stackroute.pe3;

public class Vowels {
    public Vowels() {
    }

    public static String[] removeVowels(String[] places){
        if(places==null)
            return null;
        String[] string={};
     string=new String[places.length];
     int i=0;
     for(String place:places){
         if(place==null){
             string[i++]=null;
         }
     else {
             string[i++] = place.replaceAll("[aeiou]", "");
             System.out.println(place);
         }
     }
        return string;
    }
}


