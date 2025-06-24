package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true

 */

public class has12 {
    public static void main(String[] args) {
        System.out.println(has12(new int[]{1, 3, 2}));
        System.out.println(has12(new int[]{3, 1, 2}));
        System.out.println(has12(new int[]{3, 1, 4, 5, 2}));
    }

    private static boolean has12(int[] nums) {
        boolean hasOne = false;
        boolean hasTwo = false;

        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
            }
            if (num == 2 && hasOne) {
                hasTwo = true;
            }
        }

        return hasOne && hasTwo;
    }
}