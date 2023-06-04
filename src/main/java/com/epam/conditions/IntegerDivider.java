package com.epam.conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int res = (dividend / divider) * divider;
        try {
            if (res == dividend) {
                System.out.println("can be divided completely");
            }
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        } finally {
            System.out.println("cannot be divided completely");
        }
    }
}