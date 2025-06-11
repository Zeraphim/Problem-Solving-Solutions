package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1

 */

public class array667 {
    public static void main(String[] args) {
        System.out.println(array667(new int[]{6, 6, 2}));
        System.out.println(array667(new int[]{6, 6, 2, 6}));
        System.out.println(array667(new int[]{6, 7, 2, 6}));
    }

    private static int array667(int[] nums) {
        int sixSixSevenCounter = 0;

        for (int i = 0; i < nums.length; ) {

            // Check if current number is 6 and the second number is 6 or 7
            if (i + 1 < nums.length
                    && nums[i] == 6
                    && (nums[i+1] == 6 || nums[i+1] == 7)) {
                sixSixSevenCounter++;
            }
            i++;

        }

        return sixSixSevenCounter;
    }
}
