package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false

 */

import java.util.Arrays;
import java.util.Set;

public class twoAsOne {
    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(3, 1, 2));
        System.out.println(twoAsOne(3, 2, 2));
        System.out.println(twoAsOne(2, 3, 1));
    }

    private static boolean twoAsOne(int a, int b, int c) {
        boolean isFirstScenario = (a + b) == c;
        boolean isSecondScenario = (b + c) == a;
        boolean isThirdScenario = (a + c) == b;

        return isFirstScenario || isSecondScenario || isThirdScenario;
    }

    private static boolean twoAsOneSet(int a, int b, int c) {
        Set<Integer> sums = Set.of(a + b, b + c, a + c);
        return sums.contains(a) || sums.contains(b) || sums.contains(c);
    }

    private static boolean twoAsOneSort(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        return nums[0] + nums[1] == nums[2];
    }
}