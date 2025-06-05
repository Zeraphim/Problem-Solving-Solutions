package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

 */

public class doubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
        System.out.println(doubleX("aaaax"));
        System.out.println(doubleX(""));
        System.out.println(doubleX("abc"));
        System.out.println(doubleX("x"));
        System.out.println(doubleX("xx"));
        System.out.println(doubleX("xax"));
        System.out.println(doubleX("xaxx"));
    }

    private static boolean doubleX(String str) {
        boolean isDoubleX = false;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'x' && i + 1 < str.length() && str.charAt(i+1) == 'x') {
                isDoubleX = true;
            } else if (str.charAt(i) == 'x' && i + 1 < str.length() && str.charAt(i+1) != 'x') {
                break;
            }
        }

        return isDoubleX;
    }
}