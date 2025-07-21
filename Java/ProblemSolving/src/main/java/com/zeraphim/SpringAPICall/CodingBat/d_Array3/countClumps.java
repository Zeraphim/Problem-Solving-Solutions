package com.zeraphim.SpringAPICall.CodingBat.d_Array3;

/*

Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1

 */

public class countClumps {
    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));
        System.out.println(countClumps(new int[]{1, 2, 3}));
        System.out.println(countClumps(new int[]{2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        System.out.println(countClumps(new int[]{0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        System.out.println(countClumps(new int[]{0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        System.out.println(countClumps(new int[]{0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        System.out.println(countClumps(new int[]{}));
    }

    private static int countClumps(int[] nums) {
        int clumps = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    clumps++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }

        }
        return clumps;
    }
}
