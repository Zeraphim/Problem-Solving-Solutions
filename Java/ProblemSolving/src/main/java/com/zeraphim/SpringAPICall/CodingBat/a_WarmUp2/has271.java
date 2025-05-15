package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true

has271([3, 8, 2]) → true
has271([2, 7, 3]) → true
has271([2, 7, 4]) → false
has271([2, 7, -1]) → true
has271([2, 7, -2]) → false
has271([4, 5, 3, 8, 0]) - true
has271([2, 7, 5, 10, 4]) → true
has271([2, 7, -2, 4, 9, 3]) - true
has271([2, 7, 5, 10, 1]) → false
has271([2, 7, -2, 4, 10, 2]) → false
has271([1, 1, 4, 9, 0]) → false
has271([1, 1, 4, 9, 4, 9, 2]) - true

 */

public class has271 {
    public static void main(String[] args) {
        System.out.println("has271([1, 2, 7, 1]) → true");
        System.out.println(has271(new int[]{1, 2, 7, 1}));

        System.out.println("\nhas271([1, 2, 8, 1]) → false");
        System.out.println(has271(new int[]{1, 2, 8, 1}));

        System.out.println("\nhas271([2, 7, 1]) → true");
        System.out.println(has271(new int[]{2, 7, 1}));

        System.out.println("\nhas271([3, 8, 2]) → true");
        System.out.println(has271(new int[]{3, 8, 2}));

        System.out.println("\nhas271([2, 7, 3]) → true");
        System.out.println(has271(new int[]{2, 7, 3}));

        System.out.println("\nhas271([2, 7, 4]) → false");
        System.out.println(has271(new int[]{2, 7, 4}));

        System.out.println("\nhas271([2, 7, -1]) → true");
        System.out.println(has271(new int[]{2, 7, -1}));

        System.out.println("\nhas271([2, 7, -2]) → false");
        System.out.println(has271(new int[]{2, 7, -2}));

        System.out.println("\nhas271([4, 5, 3, 8, 0]) - true");
        System.out.println(has271(new int[]{4, 5, 3, 8, 0}));

        System.out.println("\nhas271([2, 7, 5, 10, 4]) → true");
        System.out.println(has271(new int[]{2, 7, 5, 10, 4}));

        System.out.println("\nhas271([2, 7, -2, 4, 9, 3]) - true");
        System.out.println(has271(new int[]{2, 7, -2, 4, 9, 3}));

        System.out.println("\nhas271([2, 7, 5, 10, 1]) → false");
        System.out.println(has271(new int[]{2, 7, 5, 10, 1}));

        System.out.println("\nhas271([2, 7, -2, 4, 10, 2]) → false");
        System.out.println(has271(new int[]{2, 7, -2, 4, 10, 2}));

        System.out.println("\nhas271([1, 1, 4, 9, 0]) → false");
        System.out.println(has271(new int[]{1, 1, 4, 9, 0}));

        System.out.println("\nhas271([1, 1, 4, 9, 4, 9, 2]) - true");
        System.out.println(has271(new int[]{1, 1, 4, 9, 4, 9, 2}));
    }

    private static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            // Check if the next element (nums[i+1]) is exactly 5 more than the current element (nums[i]).
            // This checks the pattern where the second value in the 2-7-1 pattern is 5 greater than the first value.
            boolean isSevenPatternCorrect = nums[i + 1] == nums[i] + 5;

            // Check if the third element (nums[i+2]) is within 2 of the expected value (nums[i]-1).
            // This checks the pattern where the third value in the 2-7-1 pattern is 1 less than the first value,
            // but allows a margin of error of up to 2 units (either higher or lower).
            boolean isOnePatternWithinRange = Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2;

            if (isSevenPatternCorrect && isOnePatternWithinRange) {
                return true;
            }
        }
        return false;
    }

    private static boolean has271BruteForce(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            boolean is271Pattern = (nums[i] == 2 || nums[i] == 3 || nums[i] == 4 || nums[i] == 5)
                    && nums[i+1] == nums[i] + 5
                    && (nums[i+2] == nums[i] - 1
                    || nums[i+2] == (nums[i] - 1) - 1
                    || nums[i+2] == (nums[i] - 1) - 2
                    || nums[i+2] == (nums[i] - 1) + 1
                    || nums[i+2] == (nums[i] - 1) + 2);

            if (i + 2 < nums.length && is271Pattern) {
                return true;
            }
        }

        return false;
    }
}
