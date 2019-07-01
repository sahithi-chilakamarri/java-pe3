package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
public class Week {
    // Get calendar set to current date and time
    public class Result{
        String firstDay;
        String lastDay;
    }
    public  Result week(){
        Calendar c=Calendar.getInstance();
        Result result=new Result();
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat df=new SimpleDateFormat("EEE dd/MM/yyyy");
        result.firstDay=df.format(c.getTime());
        c.add(Calendar.DATE,6);
        result.lastDay=df.format(c.getTime());
        return result;

    }
}




