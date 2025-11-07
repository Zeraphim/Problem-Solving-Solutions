package com.zeraphim.SpringAPICall.CodingBat.d_Array1;

/*

Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]

 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class maxEnd3 {
    public static void main(String[] args) {
        System.out.println(maxEnd3(new int[]{1, 2, 3}));
        System.out.println(maxEnd3(new int[]{11, 5, 9}));
        System.out.println(maxEnd3(new int[]{2, 11, 3}));
    }

    private static int[] maxEnd3(int[] nums) {
        int largest = nums[0] > nums[2] ? nums[0] : nums[2];

        nums[0] = largest;
        nums[1] = largest;
        nums[2] = largest;

        return nums;
    }

    private static int[] maxEnd3Max(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        Arrays.fill(nums, max);
        return nums;
    }

    private static int[] maxEndScalable(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        int max = Math.max(nums[0], nums[nums.length - 1]);
        Arrays.fill(nums, max);
        return nums;
    }

    private static int[] maxEnd3Stream(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        return IntStream.range(0, nums.length)
                .map(i -> max)
                .toArray();
    }
}