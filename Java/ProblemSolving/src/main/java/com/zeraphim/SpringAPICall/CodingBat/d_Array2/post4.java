package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class post4 {
    public static void main(String[] args) {
        System.out.println(post4(new int[]{2, 4, 1, 2}));
        System.out.println(post4(new int[]{4, 1, 4, 2}));
        System.out.println(post4(new int[]{4, 4, 1, 2, 3}));
    }

    private static int[] post4(int[] nums) {
        int lastFourIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                lastFourIndex = i;
            }
        }

        int[] newArray = new int[nums.length - lastFourIndex - 1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = nums[nums.length - (nums.length - lastFourIndex - 1) + i];
        }

        return newArray;
    }

    private static int[] post4CopyOfRange(int[] nums) {
        int lastFourIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) lastFourIndex = i;
        }
        return Arrays.copyOfRange(nums, lastFourIndex + 1, nums.length);
    }

    private static int[] post4ListCollect(int[] nums) {
        int lastFourIndex = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                lastFourIndex = i;
                break;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = lastFourIndex + 1; i < nums.length; i++) {
            result.add(nums[i]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    private static int[] post4Stream(int[] nums) {
        int lastFourIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) lastFourIndex = i;
        }
        return Arrays.stream(nums, lastFourIndex + 1, nums.length).toArray();
    }
}