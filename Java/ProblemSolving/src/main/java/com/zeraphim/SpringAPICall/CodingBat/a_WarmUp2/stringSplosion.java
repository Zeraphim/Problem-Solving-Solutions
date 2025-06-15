package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"

 */

public class stringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    private static String stringSplosion(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int x = 0; x <= i; x++) {
                newString.append(str.charAt(x));
            }
        }

        return newString.toString();
    }
}