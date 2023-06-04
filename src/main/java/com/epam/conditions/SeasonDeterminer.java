package com.epam.conditions;

public class SeasonDeterminer {
    public String tellTheSeason(int monthNumber) {
        String res;
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            res = "Winter";
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            res = "Spring";
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            res = "Summer";
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            res = "Autumn";
        } else {
            res = "Wrong month number";
        }
        return res;
    }
}