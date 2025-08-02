package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp1;

/*

Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false

 */

public class in1020 {

    public static void main(String[] args) {
        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));
    }

    public static boolean in1020(int a, int b) {
        boolean numOneInRange = (a >= 10) && (a <= 20);
        boolean numTwoInRange = (b >= 10) && (b <= 20);

        return numOneInRange || numTwoInRange;
    }
}
