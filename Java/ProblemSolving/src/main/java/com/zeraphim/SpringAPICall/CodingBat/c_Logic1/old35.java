package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod

old35(3) → true
old35(10) → true
old35(15) → false

 */

public class old35 {

    public static void main(String[] args) {
        System.out.println(old35(3));
        System.out.println(old35(10));
        System.out.println(old35(15));
    }

    // XOR
    private static boolean old35(int n) {
        return (n % 3 == 0) ^ (n % 5 == 0);
    }

    // XOR
    private static boolean old35Inequality(int n) {
        return (n % 3 == 0) != (n % 5 == 0);
    }

    private static boolean old35Long(int n) {
        boolean isMultipleOfThree = n % 3 == 0;
        boolean isMultipleOfFive = n % 5 == 0;
        boolean isBothMultiple = (isMultipleOfThree && !isMultipleOfFive)
                || (!isMultipleOfThree && isMultipleOfFive);

        return isBothMultiple;
    }
}