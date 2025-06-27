package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]

 */

public class shiftLeft {
    public static void main(String[] args) {
        System.out.println(shiftLeft(new int[]{6, 2, 5, 3}));
        System.out.println(shiftLeft(new int[]{1, 2}));
        System.out.println(shiftLeft(new int[]{1}));
    }

    private static int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int tempFirstIndex = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                nums[i] = nums[i+1];
            } else {
                nums[i] = tempFirstIndex;
            }
        }

        return nums;
    }
}