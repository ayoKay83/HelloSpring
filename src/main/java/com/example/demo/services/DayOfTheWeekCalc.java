package com.example.demo.services;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class DayOfTheWeekCalc {

    Calendar calendar = new GregorianCalendar();
    Random r = new Random();

    private int day = calendar.get(Calendar.DAY_OF_MONTH);
    private int month = calendar.get(Calendar.MONTH);
    private int year = calendar.get(Calendar.YEAR);
    private int k = year % 100;
    private int j = year / 100;


    private int m = month;
    private int q = day;
    private double h;
    private boolean isCorona;

    public String isItFridayCalc() {

        setMonth(month); // MONTH starter fra 0

        h = (q + Math.floor(13 * (m + 1) / 5) + k + Math.floor(k / 4) + Math.floor(j / 4) - Math.floor(2 * j)) % 7;

        isCorona = r.nextBoolean();

        if (h == 7 && isCorona != true) {
            return "Is it Friday???\n" + "YES";
        } else if (h != 7 && isCorona != true){
            return "Is it Friday???\n" + "NO";
        }
          else {
              return "Sorry mate! When Corona it's never Friday :(";
        }
    }

    private void setMonth(int month) {
        if (month == 0 || month == 1) {
            month += 13;
            year -= 1;
            k = year % 100;
            j = year / 100;
        }
    }

}
