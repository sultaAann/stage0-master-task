package com.epam.loops;

import com.epam.conditions.TriangleSidesValidator;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        String a = "*";
        for (int i = 3; i < cathetusLength + 3; i++) {
            for (int a1 = i; a1 < cathetusLength+ 2; a1++)
                System.out.print(" ");
            System.out.println(a);
            a = "*"+a;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(7);
    }

}
