package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2

 */

public class last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }

    private static int last2(String str) {

        if (str.length() < 2) {
            return 0;
        }

        // Get the last 2 characters of the String
        String last2String = str.substring(str.length() - 2);

        // Counter for the times the last 2 characters were repeated
        int last2Count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(last2String)) {
                last2Count++;
            }
        }

        return last2Count;
    }
}