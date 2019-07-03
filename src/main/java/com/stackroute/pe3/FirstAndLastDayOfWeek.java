package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class FirstAndLastDayOfWeek {
    // Get calendar set to current date and time.
        String firstDay;
        String lastDay;
    public FirstAndLastDayOfWeek week(){

        Calendar c=Calendar.getInstance();
        FirstAndLastDayOfWeek result=new FirstAndLastDayOfWeek();
        //set the day of the week to Mponday
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        //Setting the pattern how to print.
        DateFormat df=new SimpleDateFormat("EEE dd/MM/yyyy");
        result.firstDay=df.format(c.getTime());
        //Set the day of the week to Sunday.
        c.add(Calendar.DATE,6);
        result.lastDay=df.format(c.getTime());
        return result;
    }
}




