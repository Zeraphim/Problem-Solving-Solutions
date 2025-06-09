package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

public class stringTimes {

    public static void main(String[] args) {

    }

    public static String stringTimes(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += str;
        }

        return result;
    }
}