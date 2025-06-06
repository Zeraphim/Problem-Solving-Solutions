package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3

 */

public class countXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    private static int countXX(String str) {
        int xCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && i + 1 < str.length() && str.charAt(i+1) == 'x') {
                xCount++;
            }
        }

        return xCount;
    }
}