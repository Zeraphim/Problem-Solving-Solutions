package com.zeraphim.SpringAPICall.CodingBat.d_Array1;

/*

Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false

 */

public class double23 {
    public static void main(String[] args) {
        System.out.println(double23(new int[]{2, 2}));
        System.out.println(double23(new int[]{3, 3}));
        System.out.println(double23(new int[]{2, 3}));
    }

    private static boolean double23(int[] nums) {
        int twoCount = 0;
        int threeCount = 0;

        for (int num : nums) {
            if (num == 2) {
                twoCount++;
            } else if (num == 3) {
                threeCount++;
            }
        }

        return twoCount == 2 || threeCount == 2;
    }
}