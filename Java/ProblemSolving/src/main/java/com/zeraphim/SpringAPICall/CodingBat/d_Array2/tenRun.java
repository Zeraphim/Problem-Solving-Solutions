package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]

 */

public class tenRun {
    public static void main(String[] args) {
        System.out.println(tenRun(new int[]{2, 10, 3, 4, 20, 5}));
        System.out.println(tenRun(new int[]{10, 1, 20, 2}));
        System.out.println(tenRun(new int[]{10, 1, 9, 20}));
    }

    private static int[] tenRun(int[] nums) {
        int multipleOfTen = 0;
        boolean isMultipleFound = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                multipleOfTen = nums[i];
                isMultipleFound = true;
            }
            if (isMultipleFound) {
                nums[i] = multipleOfTen;
            }
        }

        return nums;
    }
}