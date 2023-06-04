package com.epam.conditions;

public class TriangleSidesValidator {
    public String validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide)  {
            return "this is a valid triangle";
        } else {
            return "it's not a triangle";
        }
    }
}