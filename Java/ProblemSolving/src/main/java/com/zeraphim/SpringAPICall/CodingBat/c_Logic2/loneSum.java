package com.zeraphim.SpringAPICall.CodingBat.c_Logic2;

/*

Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0

 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class loneSum {
    public static void main(String[] args) {
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
    }

    private static int loneSum(int a, int b, int c) {
        boolean isAllSame = a == b && b == c;
        boolean isABSame = a == b;
        boolean isBCSame = b == c;
        boolean isACSame = a == c;

        if (isAllSame) {
            return 0;
        } else if (isABSame) {
            return c;
        } else if (isBCSame) {
            return a;
        } else if (isACSame) {
            return b;
        }

        return a + b + c;
    }

    private static int loneSumMap(int a, int b, int c) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] nums = {a, b, c};

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for (int num : nums) {
            if (freq.get(num) == 1) {
                sum += num;
            }
        }
        return sum;
    }

    private static int loneSumShort(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) sum += a;
        if (b != a && b != c) sum += b;
        if (c != a && c != b) sum += c;
        return sum;
    }

    private static int loneSumFilterSet(int a, int b, int c) {
        Set<Integer> unique = new HashSet<>();
        int sum = 0;

        if (a != b && a != c) unique.add(a);
        if (b != a && b != c) unique.add(b);
        if (c != a && c != b) unique.add(c);

        for (int val : unique) {
            sum += val;
        }
        return sum;
    }
}
