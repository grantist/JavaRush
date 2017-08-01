package com.javarush.task.task20.task2001;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 * Created by TRACTEL_RND on 06.03.2017.
 */
public class Simpledateformat {

    private Date birthDate;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public static void main(String[] args) {

        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyг.");
        Long time = currentDate.getTime();
        long anotherDate = -1;
        time = time + (60*60*24*1000*anotherDate);
        currentDate = new Date(time);
        System.out.println("Date currentDate = " + currentDate.getTime());
        //System.out.println(sdf.get.Tiformat(currentDate));






    }


}


