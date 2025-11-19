package com.zeraphim.SpringAPICall.CodingBat.d_Array1;

/*

Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]

 */

import java.util.stream.IntStream;

public class makeEnds {
    public static void main(String[] args) {
        System.out.println(makeEnds(new int[]{1, 2, 3}));
        System.out.println(makeEnds(new int[]{1, 2, 3, 4}));
        System.out.println(makeEnds(new int[]{7, 4, 6, 2}));
    }

    private static int[] makeEnds(int[] nums) {

        int[] startEndsList = {nums[0], nums[nums.length - 1]};

        return startEndsList;
    }

    private static int[] makeEndsArrayCopy(int[] nums) {
        int[] result = new int[2];
        System.arraycopy(nums, 0, result, 0, 1);
        System.arraycopy(nums, nums.length - 1, result, 1, 1);
        return result;
    }

    private static int[] makeEndsStream(int[] nums) {
        return IntStream.of(nums[0], nums[nums.length - 1]).toArray();
    }
}