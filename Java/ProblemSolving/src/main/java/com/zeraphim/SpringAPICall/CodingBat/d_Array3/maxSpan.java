package com.zeraphim.SpringAPICall.CodingBat.d_Array3;

/*

Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

 */

import java.util.HashMap;
import java.util.Map;

public class maxSpan {
    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
    }

    private static int maxSpan(int[] nums){
        int maxSpanCount = 0;
        int tempNumStart = 0;

        if (nums.length == 0){
            return 0;
        }

        for (int i = 0; i < nums.length; i++){
            tempNumStart = nums[i];

            for(int j = nums.length - 1; j > 0 + i; j--){
                if (tempNumStart == nums[j]){
                    if (j > maxSpanCount) {
                        maxSpanCount = j + 1 - i;
                    }
                }
            }
        }

        if ((nums.length == 2 || nums.length == 1) && maxSpanCount == 0){
            return 1;
        }

        return maxSpanCount;
    }

    public static int maxSpanHashMap(int[] nums) {
        Map<Integer, Integer> firstOccurrence = new HashMap<>();
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!firstOccurrence.containsKey(nums[i])) {
                firstOccurrence.put(nums[i], i);
            }
            int span = i - firstOccurrence.get(nums[i]) + 1;
            if (span > maxSpan) {
                maxSpan = span;
            }
        }

        return maxSpan;
    }

    public static int maxSpanBruteForce(int[] nums) {
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    int span = j - i + 1;
                    if (span > maxSpan) {
                        maxSpan = span;
                    }
                    break; // No need to go further left
                }
            }
        }

        return maxSpan;
    }
}