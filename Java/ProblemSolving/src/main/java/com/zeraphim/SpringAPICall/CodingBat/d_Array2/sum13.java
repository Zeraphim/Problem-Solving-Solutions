package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6

 */

public class sum13 {
    public static void main(String[] args) {
        System.out.println(sum13(new int[]{1, 2, 2, 1}));
        System.out.println(sum13(new int[]{1, 1}));
        System.out.println(sum13(new int[]{1, 2, 2, 1, 13}));
    }

    private static int sum13(int[] nums) {
        int sum = 0;
        boolean isPrevious13 = false;

        for (int num : nums) {
            if (num == 13) {
                isPrevious13 = true;
            } else if(isPrevious13) {
                isPrevious13 = false;
            } else {
                sum += num;
            }
        }

        return sum;
    }
}