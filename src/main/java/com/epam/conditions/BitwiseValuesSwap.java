package com.epam.conditions;

public class BitwiseValuesSwap {
    public int[] swap(int first, int second) {
        first = first + second;
        second = first - second;
        first = first - second;
        return new int[] {first, second};
    }
}
