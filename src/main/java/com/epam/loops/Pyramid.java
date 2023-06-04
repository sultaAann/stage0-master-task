package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength >= 10) return;
        String a = "1";
        for (int i = 2; i < cathetusLength + 2; i++) {
            for (int a1 = i; a1 < cathetusLength+ 2; a1++)
                System.out.print(" ");
                System.out.println(a);
                a = i+a+i;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
