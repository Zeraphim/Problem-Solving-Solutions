package com.zeraphim.SpringAPICall.CodingBat.c_Logic2;

/*

Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false

 */

import java.util.Arrays;

public class evenlySpaced {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
    }

    private static boolean evenlySpaced(int a, int b, int c) {
        int[] numsOrderedList = {a, b, c};
        Arrays.sort(numsOrderedList);

        int abDiff = numsOrderedList[1] - numsOrderedList[0];
        int bcDiff = numsOrderedList[2] - numsOrderedList[1];

        return abDiff == bcDiff;
    }
}
