package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class centeredAverage {
    public static void main(String[] args) {
        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }

    private static int centeredAverage(int[] nums) {
        Arrays.sort(nums);

        int sumNumbers = 0;
        int countNumbers = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && i != nums.length - 1) {
                sumNumbers += nums[i];
                countNumbers++;
            }
        }

        return sumNumbers / countNumbers;
    }

    private static int centeredAverageMinMax(int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return (sum - min - max) / (nums.length - 2);
    }

    private static int centeredAverageStreams(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        list.remove(list.indexOf(Collections.min(list)));
        list.remove(list.indexOf(Collections.max(list)));

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        return sum / list.size();
    }
}