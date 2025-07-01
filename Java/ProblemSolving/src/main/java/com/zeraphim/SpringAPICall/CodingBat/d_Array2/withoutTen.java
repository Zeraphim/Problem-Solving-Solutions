package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]

 */

public class withoutTen {
    public static void main(String[] args) {
        System.out.println(withoutTen(new int[]{1, 10, 10, 2}));
        System.out.println(withoutTen(new int[]{10, 2, 10}));
        System.out.println(withoutTen(new int[]{1, 99, 10}));
    }

    private static int[] withoutTen(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                nums[i] = 0;
            }
        }

        int[] shiftedArray = new int[nums.length];
        int zeroIndex = 0;
        int nonZeroIndex = nums.length - 1;

        for (int num : nums) {
            if (num == 0) {
                shiftedArray[nonZeroIndex--] = 0;
            } else {
                shiftedArray[zeroIndex++] = num;
            }
        }

        return shiftedArray;
    }
}