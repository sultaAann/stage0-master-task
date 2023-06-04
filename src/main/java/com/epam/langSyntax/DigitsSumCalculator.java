package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String[] nums = ("" + number).split("");
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += Integer.parseInt(nums[i]);
        }
        System.out.println(res);
    }
}
