package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod

nearTen(12) → true
nearTen(17) → false
nearTen(19) → true

 */

public class nearTen {
    public static void main(String[] args) {
        System.out.println(nearTen(12));
        System.out.println(nearTen(17));
        System.out.println(nearTen(19));
    }

    private static boolean nearTen(int num) {
        int mod = num % 10;
        return mod <= 2 || mod >= 8;
    }

    private static boolean nearTenLong(int num) {
        return num % 10 == 2 || num % 10 == 1 || (num + 1) % 10 == 0 || (num + 2) % 10 == 0 || num % 10 == 0;
    }
}