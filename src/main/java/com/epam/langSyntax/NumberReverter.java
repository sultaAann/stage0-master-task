package com.epam.langSyntax;



public class NumberReverter {

    public void revert(int number) {
        String[] nums = ("" + number).split("");
        String integer = nums[0];
        nums[0] = nums[2];
        nums[2] = integer;
        String a="";
        for (String e: nums) {
            a+=e;
        }
        System.out.println(a);
    }
}
