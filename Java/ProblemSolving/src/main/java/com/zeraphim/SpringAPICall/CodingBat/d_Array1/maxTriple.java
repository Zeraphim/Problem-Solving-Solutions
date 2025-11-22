package com.zeraphim.SpringAPICall.CodingBat.d_Array1;

/*

Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5

 */

public class maxTriple {
    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1, 2, 3}));
        System.out.println(maxTriple(new int[]{1, 5, 3}));
        System.out.println(maxTriple(new int[]{5, 2, 3}));
    }

    private static int maxTriple(int[] nums) {
        int largest = 0;

        int firstValue = nums[0];
        int middleValue = nums[nums.length / 2];
        int lastValue = nums[nums.length - 1];

        if (firstValue > largest) {
            largest = firstValue;
        }

        if (middleValue > largest) {
            largest = middleValue;
        }

        if (lastValue > largest) {
            largest = lastValue;
        }

        return largest;
    }

    private static int maxTripleMax(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        return Math.max(first, Math.max(middle, last));
    }

    private static int maxTripleLoop(int[] nums) {
        int[] values = {nums[0], nums[nums.length / 2], nums[nums.length - 1]};
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    private static int maxTripleStreams(int[] nums) {
        return java.util.Arrays.stream(new int[]{
                nums[0], nums[nums.length / 2], nums[nums.length - 1]
        }).max().getAsInt();
    }
}
