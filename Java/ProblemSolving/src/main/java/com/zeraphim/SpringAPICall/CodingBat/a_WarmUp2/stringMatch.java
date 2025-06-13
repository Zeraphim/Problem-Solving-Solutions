package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0

stringMatch ("hello", "he") → 1
stringMatch("he", "hello") → 1
stringMatch("h", "hello") → 0
stringMatch("', "hello")→ 0
stringMatch("aabbccdd", "abbbxxd") → 1
stringMatch("aaxxaaxx", "iaxxai") → 3
stringMatch("iaxxai", "aaxxaaxx") → 3

 */

public class stringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
        System.out.println(stringMatch ("hello", "he"));
        System.out.println(stringMatch("he", "hello"));
        System.out.println(stringMatch("h", "hello"));
        System.out.println(stringMatch("", "hello"));
        System.out.println(stringMatch("aabbccdd", "abbbxxd"));
        System.out.println(stringMatch("iaxxai", "aaxxaaxx"));
    }

    private static int stringMatch(String a, String b) {
        int matchCount = 0;

        String shortestString = "";

        // Get the length of the shortest string
        if (a.length() < b.length()) {
            shortestString = a;
        } else {
            shortestString = b;
        }

        // Loop through the shortest string and compare substrings
        for (int i = 0; i < shortestString.length() - 1; i++) {
            if (i < b.length() - 1){
                boolean isMatchString = a.substring(i, i + 2).equals(b.substring(i, i + 2));
                boolean isPossible = (i + 2 <= a.length() && i + 2 <= b.length());

                if (isMatchString && isPossible) {
                    matchCount++;
                }
            }
        }

        return matchCount;
    }
}