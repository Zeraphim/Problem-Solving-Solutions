package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod

specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false

 */

public class specialEleven {
    public static void main(String[] args) {
        System.out.println(specialEleven(22));
        System.out.println(specialEleven(23));
        System.out.println(specialEleven(24));
    }

    private static boolean specialEleven(int n) {
        boolean isSpecialEleven = n % 11 == 0 || n % 11 == 1;

        return isSpecialEleven;
    }
}