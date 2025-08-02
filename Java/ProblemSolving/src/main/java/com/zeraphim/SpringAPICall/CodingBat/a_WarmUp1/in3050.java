package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp1;

/*

Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true

 */

public class in3050 {
    public static void main(String[] args) {
        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));
    }

    public static boolean in3050(int a, int b) {
        boolean numOneInRange30To40 = a >= 30 && a <= 40;
        boolean numTwoInRange30To40 = b >= 30 && b <= 40;

        boolean numOneInRange40To50 = a >= 40 && a <= 50;
        boolean numTwoInRange40To50 = b >= 40 && b <= 50;


        return (numOneInRange30To40 && numTwoInRange30To40)
                || (numOneInRange40To50 && numTwoInRange40To50);
    }
}