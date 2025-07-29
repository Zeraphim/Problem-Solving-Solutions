package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"

 */

public class frontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
        System.out.println(frontTimes("Ab", 4));
        System.out.println(frontTimes("A", 4));
        System.out.println(frontTimes("", 4));
        System.out.println(frontTimes("Abc", 0));
    }

    private static String frontTimes(String str, int n) {
        StringBuilder toBeRepeated = new StringBuilder();
        int maxLengthToRepeat = Math.min(str.length(), 3);

        for (int i = 0; i < n; i++) {
            for (int x = 0; x < maxLengthToRepeat; x++) {
                toBeRepeated.append(str.charAt(x));
            }
        }

        return toBeRepeated.toString();
    }
}