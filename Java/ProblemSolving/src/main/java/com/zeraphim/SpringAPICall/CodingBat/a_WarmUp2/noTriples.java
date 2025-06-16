package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false

 */

public class noTriples {
    public static void main(String[] args) {
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 1}));
    }

    private static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            boolean isEqualThreePairs = nums[i] == nums[i+1] && nums[i] == nums[i+2];

            if (i + 2 < nums.length && isEqualThreePairs) {
                return false;
            }
        }

        return true;
    }
}
