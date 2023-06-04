package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
         int i = 1;
         while (i < power - 1){
            numberToPrint*=numberToPrint;
            i++;
        }
        System.out.println(numberToPrint);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 4);
    }

}
