package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"

 */

public class stringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));

    }

    private static String stringX(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != 'x' || (i == 0 || i == str.length() - 1)) {
                newString.append(str.charAt(i));
            }
        }

        return newString.toString();
    }
}