package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true

 */

public class array123 {
    public static void main(String[] args) {
        System.out.println(array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    private static boolean array123(int[] nums) {
        int[] sequence = {1, 2, 3};

        // Edge case handling
        if (nums == null
                || nums.length < sequence.length) {
            return false;
        }

        // Subtract length of sequence to the length of nums array
        // to ensure that there are enough elements to loop through
        // to match the entire sequence [1, 2, 3]
        for (int possibleSequenceIterator = 0; possibleSequenceIterator <= nums.length - sequence.length; possibleSequenceIterator++) {
            boolean found = true;

            for (int sequenceIterator = 0; sequenceIterator < sequence.length; sequenceIterator++) {
                if (nums[possibleSequenceIterator + sequenceIterator] != sequence[sequenceIterator]){
                    found = false;
                    break;
                }
            }

            if (found) {
                return true;
            }
        }

        // If sequence is not found, return false by default
        return false;
    }
}