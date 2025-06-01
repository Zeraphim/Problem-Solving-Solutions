package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.

maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3

 */

public class maxMod5 {
    public static void main(String[] args) {
        System.out.println(maxMod5(2, 3));
        System.out.println(maxMod5(6, 2));
        System.out.println(maxMod5(3, 2));
    }

    private static int maxMod5(int a, int b) {
        int largeVal = Math.max(a, b);
        int smallVal = Math.min(a, b);
        boolean isSameRemainder = a % 5 == b % 5;
        boolean isSameValue = a == b;

        if (isSameValue) {
            return 0;
        }
        else if (isSameRemainder) {
            return smallVal;
        }

        return largeVal;
    }

    private static int maxMod5Simple(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    private static int maxMod5Ternary(int a, int b) {
        return (a == b) ? 0 : (a % 5 == b % 5 ? Math.min(a, b) : Math.max(a, b));
    }
}