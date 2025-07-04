package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]

*/

public class evenOdd {
    public static void main(String[] args) {
        System.out.println(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}));
        System.out.println(evenOdd(new int[]{3, 3, 2}));
        System.out.println(evenOdd(new int[]{2, 2, 2}));
    }

    private static int[] evenOdd(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 == 1){
                right--;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }
}