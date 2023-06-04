package com.epam.conditions;

import java.util.HashMap;
import java.util.Map;

public class DaysInMonth {
    public void printDays(int year, int month) {
        Map<Integer, Integer> daysInMonthDict = new HashMap<>() {{
            put(1, 31);
            put(2, is_leap_year(year) ? 29 : 28);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        System.out.println(daysInMonthDict.get(month));
    }

    private static boolean is_leap_year(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}