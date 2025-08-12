package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp1;

/*

Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"

 */

public class notString {
    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));

    }

    public static String notString(String str) {
        boolean isStartingWithNot = str.startsWith("not");

        if (isStartingWithNot) {
            return str;
        }

        return "not " + str;
    }
}