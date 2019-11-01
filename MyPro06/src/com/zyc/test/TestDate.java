package com.zyc.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd");
        String str=df.format(new Date());
        System.out.println(str);
        Calendar calendar = new GregorianCalendar();
        Date date=calendar.getTime();
        calendar.setTime(date);
        System.out.println(calendar);

    }
}
