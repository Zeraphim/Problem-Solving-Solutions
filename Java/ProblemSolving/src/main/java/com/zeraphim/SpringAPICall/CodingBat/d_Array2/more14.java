package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true

 */

public class more14 {
    public static void main(String[] args) {
        System.out.println(more14(new int[]{1, 4, 1}));
        System.out.println(more14(new int[]{1, 4, 1, 4}));
        System.out.println(more14(new int[]{1, 1}));
    }

    private static boolean more14(int[] nums) {
        int oneCount = 0;
        int fourCount = 0;

        for (int num : nums) {
            if (num == 1) {
                oneCount++;
            }

            if (num == 4) {
                fourCount++;
            }
        }

        return oneCount > fourCount;
    }
}