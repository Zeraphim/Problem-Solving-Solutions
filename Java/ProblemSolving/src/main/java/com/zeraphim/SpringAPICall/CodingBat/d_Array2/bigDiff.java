package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8

 */

public class bigDiff {
    public static void main(String[] args) {
        System.out.println(bigDiff(new int[]{10, 3, 5, 6}));
        System.out.println(bigDiff(new int[]{7, 2, 10, 9}));
        System.out.println(bigDiff(new int[]{2, 10, 7, 2}));
    }

    private static int bigDiff(int[] nums) {
        int maxNum = 0;
        int minNum = 100;

        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }

        return maxNum - minNum;
    }

    private static int bigDiffArrayCopy(int[] nums) {
        int[] copy = java.util.Arrays.copyOf(nums, nums.length);

        java.util.Arrays.sort(copy);

        return copy[copy.length - 1] - copy[0];
    }

    private static int bigDiffStreams(int[] nums) {
        int min = java.util.Arrays.stream(nums).min().getAsInt();
        int max = java.util.Arrays.stream(nums).max().getAsInt();

        return max - min;
    }
}