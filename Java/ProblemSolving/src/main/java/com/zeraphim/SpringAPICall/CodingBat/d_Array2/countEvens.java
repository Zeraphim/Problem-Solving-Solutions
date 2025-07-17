package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0

 */

public class countEvens {
    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int[]{1, 3, 5}));
    }

    private static int countEvens(int[] nums) {
        int countEvenNums = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                countEvenNums++;
            }
        }

        return countEvenNums;
    }

    private static int countEvensStreams(int[] nums) {
        return (int) java.util.Arrays.stream(nums).filter(n -> n % 2 == 0).count();
    }

    private static int countEvensRecursion(int[] nums) {
        return countEvensRecursionHelper(nums, 0);
    }

    private static int countEvensRecursionHelper(int[] nums, int index) {
        if (index == nums.length) return 0;
        return (nums[index] % 2 == 0 ? 1 : 0) + countEvensRecursionHelper(nums, index + 1);
    }
}