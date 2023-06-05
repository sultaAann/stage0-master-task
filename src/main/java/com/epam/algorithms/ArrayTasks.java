package com.epam.algorithms;


public class ArrayTasks {

    public String[] seasonsArray() {
        return new String[] {"Winter", "Spring", "Summer", "Autumn"};
    }

    public int[] generateNumbers(int length) {
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = i+1;
        }
        return res;
    }


    public int totalSum(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res+=arr[i];
        }
        return res;
    }


    public int findIndexOfNumber(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) return i;
        }
        return index;
    }


    public String[] reverseArray(String[] arr) {
        String a;
        String b;
        for (int i = 0; i < arr.length / 2; i++) {
            a = arr[i];
            b = arr[arr.length - i - 1];
            arr[i] = b;
            arr[arr.length - i - 1] = a;
        }
        return arr;
    }


    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] res = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) res[k++] = arr[i];
        }
        int newLength = k - 0;
        int[] copy = new int[newLength];
        System.arraycopy(res, 0, copy, 0,
                Math.min(res.length - 0, newLength));
        return copy;
    }


    public int[][] sortRaggedArray(int[][] arr) {

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int s = 0; s < arr[i].length; s++) {
                for (int j = s + 1; j < arr[i].length; j++) {
                    if (arr[i][s] > arr[i][j]) {
                        temp = arr[i][s];
                        arr[i][s] = arr[i][j];
                        arr[i][j] = temp;
                    }
                }
            }
        }
        return arr;
    }

}
