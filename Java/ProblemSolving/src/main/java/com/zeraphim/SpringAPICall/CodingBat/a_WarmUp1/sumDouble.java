package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp1;

/*

Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

 */

public class sumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }

    public static int sumDouble(int a, int b) {
        int sumResult = 0;

        if (a == b) {
            sumResult += (a + b) * 2;
        } else {
            sumResult += a + b;
        }

        return sumResult;
    }
}