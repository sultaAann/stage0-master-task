package com.epam.langSyntax;

public class DigitsSumCalculator {

    public int calculateSum(int number) {
        String[] nums = ("" + number).split("");
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += Integer.parseInt(nums[i]);
        }
        return res;
    }

}
