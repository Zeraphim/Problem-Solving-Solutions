package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp1;

/*

Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
lastDigit (114, 113) → false
lastDigit (114, 4) → true
lastDigit(10, 0) → true
lastDigit (11, 0) → false

 */

public class lastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
        System.out.println(lastDigit(114, 113));
        System.out.println(lastDigit(114, 4));
        System.out.println(lastDigit(10, 0));
        System.out.println(lastDigit(11, 0));
    }

    public static boolean lastDigit(int a, int b) {
        int modFirstNum = a % 10;
        int modSecondNum = b % 10;

        return modFirstNum == modSecondNum;
    }
}
