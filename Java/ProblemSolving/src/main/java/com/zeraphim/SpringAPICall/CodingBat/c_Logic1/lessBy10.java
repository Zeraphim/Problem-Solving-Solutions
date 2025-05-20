package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true

 */

import java.util.Arrays;

public class lessBy10 {
    public static void main(String[] args) {
        System.out.println(lessBy10(1, 7, 11));
        System.out.println(lessBy10(1, 7, 10));
        System.out.println(lessBy10(11, 1, 7));
    }

    private static boolean lessBy10Long(int a, int b, int c) {

        if (Math.abs(a - b) >= 10
                || Math.abs(a - c) >= 10
                || Math.abs(c - b) >= 10
                || Math.abs(c - a) >= 10
                || Math.abs(b - c) >= 10
        ) {
            return true;
        }

        return false;
    }

    private static boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
    }

    private static boolean lessBy10Sort(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        return nums[2] - nums[0] >= 10;
    }

    private static boolean lessBy10MinMax(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        return max - min >= 10;
    }
}