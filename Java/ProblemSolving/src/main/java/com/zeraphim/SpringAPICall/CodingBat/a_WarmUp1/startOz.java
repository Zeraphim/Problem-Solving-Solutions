package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp1;

/*

Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"

 */

public class startOz {
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
        System.out.println(startOz("oz"));
        System.out.println(startOz("ounce"));
        System.out.println(startOz("o"));
        System.out.println(startOz("abc"));
        System.out.println(startOz(""));
        System.out.println(startOz("zoo"));
        System.out.println(startOz("aztec"));
        System.out.println(startOz("zzzz"));
        System.out.println(startOz("oznic"));
    }

    public static String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o' ) {
            result += str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z' ) {
            result += str.charAt(1);
        }

        return result;
    }
}