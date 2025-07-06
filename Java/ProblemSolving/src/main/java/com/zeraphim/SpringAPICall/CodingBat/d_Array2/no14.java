package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true

 */

import java.util.Arrays;

public class no14 {
    public static void main(String[] args) {
        System.out.println(no14(new int[]{1, 2, 3}));
        System.out.println(no14(new int[]{1, 2, 3, 4}));
        System.out.println(no14(new int[]{2, 3, 4}));
    }

    private static boolean no14(int[] nums) {
        boolean hasOne = false;
        boolean hasFour = false;

        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
            }
            if (num == 4) {
                hasFour = true;
            }

            if (hasOne && hasFour) {
                return false;
            }
        }

        return !hasOne || !hasFour;
    }


    private static boolean no14Counting(int[] nums) {
        int oneCount = 0;
        int fourCount = 0;

        for (int num : nums) {
            if (num == 1) oneCount++;
            if (num == 4) fourCount++;
        }

        return oneCount == 0 || fourCount == 0;
    }

    private static boolean no14Streams(int[] nums) {
        boolean hasOne = Arrays.stream(nums).anyMatch(n -> n == 1);
        boolean hasFour = Arrays.stream(nums).anyMatch(n -> n == 4);

        return !hasOne || !hasFour;
    }
}