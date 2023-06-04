package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        String a = "*";
        for (int i = 2; i < cathetusLength + 2; i++) {
            for (int a1 = i; a1 < cathetusLength+ 2; a1++)
                System.out.print(" ");
            System.out.println(a);
            a = "*"+a;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
