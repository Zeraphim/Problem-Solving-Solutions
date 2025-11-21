package com.zeraphim.SpringAPICall.CodingBat.d_Array1;

/*

Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false

 */

public class firstLast6 {
    public static void main(String[] args) {
        System.out.println(firstLast6(new int[]{1, 2, 6}));
        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3}));
    }

    private static boolean firstLast6(int[] nums) {
        boolean firstIs6 = nums[0] == 6;
        boolean lastIs6 = nums[nums.length - 1] == 6;

        return firstIs6 || lastIs6;
    }
}