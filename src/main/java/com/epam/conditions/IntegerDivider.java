package com.epam.conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int res = (dividend / divider) * divider;
        if (res == dividend) {
            System.out.println("can be divided completely");
        } else if (res == 0 || dividend == 0) {
            System.out.println("division by zero");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}