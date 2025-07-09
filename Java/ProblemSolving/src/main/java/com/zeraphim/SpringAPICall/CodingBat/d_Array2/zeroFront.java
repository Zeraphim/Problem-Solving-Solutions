package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]

 */

public class zeroFront {
    public static void main(String[] args) {
        System.out.println(zeroFront(new int[]{1, 0, 0, 1}));
        System.out.println(zeroFront(new int[]{0, 1, 1, 0, 1}));
        System.out.println(zeroFront(new int[]{1, 0}));
    }

    private static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int zeroIndex = 0;
        int nonZeroIndex = nums.length - 1;

        for (int num : nums) {
            if (num == 0) {
                result[zeroIndex++] = 0;
            } else {
                result[nonZeroIndex--] = num;
            }
        }

        return result;
    }
}