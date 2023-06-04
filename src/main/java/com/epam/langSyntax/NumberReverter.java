package com.epam.langSyntax;

import java.util.Arrays;

public class NumberReverter {

    public void revert(int number) {
        String[] nums = ("" + number).split("");
        String integer = nums[0];
        nums[0] = nums[2];
        nums[2] = integer;
        System.out.println(Arrays.toString(nums));
    }
}
