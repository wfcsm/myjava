package com.zyc.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) throws ParseException {
        String str = "2019-11-01";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date=df.parse(str);
        Calendar c = new GregorianCalendar();
        c.setTime(date);

        System.out.println("日\t一\t二\t三\t四\t五\t六");

        int maxDays=c.getActualMaximum(Calendar.DATE);
        int day = c.get(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH,1);


//        System.out.println(c.getActualMaximum(Calendar.MONTH));

        for(int i=0; i<c.get(Calendar.DAY_OF_WEEK)-1; i++){
            System.out.print("\t");
        }

        for(int i=1; i<=maxDays; i++) {
            if (c.get(Calendar.DAY_OF_MONTH)==day){
                System.out.print(c.get(Calendar.DAY_OF_MONTH) + "*\t");
            }else {
                System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
            }


            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }

            c.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}
